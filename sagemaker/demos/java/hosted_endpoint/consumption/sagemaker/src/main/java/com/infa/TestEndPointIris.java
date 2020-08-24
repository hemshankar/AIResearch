package com.infa;

import com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntime;
import com.amazonaws.services.sagemakerruntime.AmazonSageMakerRuntimeClientBuilder;
import com.amazonaws.services.sagemakerruntime.model.InvokeEndpointRequest;
import com.amazonaws.services.sagemakerruntime.model.InvokeEndpointResult;

import java.nio.ByteBuffer;

public class TestEndPointIris
{
    public static void main( String[] args )
    {
        try{
        System.out.println("1-----------");
        AmazonSageMakerRuntime runtime = AmazonSageMakerRuntimeClientBuilder.defaultClient();

        System.out.println("2-----------");
        //String body = "{\"instances\": [1.0,2.0,5.0]}";
        String body = "[1.0, 2.0, 5.0, 6.0]";

        System.out.println("3-----------");
        ByteBuffer bodyBuffer = ByteBuffer.wrap(body.getBytes());

        System.out.println("4-----------");
        InvokeEndpointRequest request = new InvokeEndpointRequest()
                .withEndpointName("sagemaker-tensorflow-2020-08-24-14-57-28-599")
                .withBody(bodyBuffer);
        request.setContentType("application/json");
        System.out.println("5-----------");
        InvokeEndpointResult invokeEndpointResult = runtime.invokeEndpoint(request);
        System.out.println("6-----------");
        String bodyResponse = new String(invokeEndpointResult.getBody().array());
        System.out.println("7-----------");
        System.out.println(bodyResponse);
        }catch(Exception e){
                e.printStackTrace();
        }
    }
}
