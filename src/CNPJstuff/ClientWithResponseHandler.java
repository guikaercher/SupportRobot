package CNPJstuff;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * This example demonstrates the use of the {@link ResponseHandler} to simplify
 * the process of processing the HTTP response and releasing associated resources.
 */
public class ClientWithResponseHandler implements Runnable {
    
    private  String cnpj;
    private String dadosColetados;

    public ClientWithResponseHandler(String cnpj) {
        this.cnpj = cnpj;
        dadosColetados = "";
    }

  
    
    
    
    
    public String getDadosColetados(){
        return dadosColetados;
    }
    @Override
    public void run() {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet("http://receitaws.com.br/v1/cnpj/" + cnpj);

            System.out.println("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            
            System.out.println("----------------------------------------");
            dadosColetados = responseBody;
            //System.out.println(responseBody);
            
            httpclient.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ClientWithResponseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    


