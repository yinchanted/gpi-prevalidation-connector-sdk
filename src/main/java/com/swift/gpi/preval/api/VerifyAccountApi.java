/*
 * Beneficiary account pre-validation
 * Move your app forward with the Account Pre-Validation API
 *
 * OpenAPI spec version: 1.0.7-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swift.gpi.preval.api;

import com.swift.gpi.preval.ApiCallback;
import com.swift.gpi.preval.ApiClient;
import com.swift.gpi.preval.ApiException;
import com.swift.gpi.preval.ApiResponse;
import com.swift.gpi.preval.Configuration;
import com.swift.gpi.preval.Pair;
import com.swift.gpi.preval.ProgressRequestBody;
import com.swift.gpi.preval.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.swift.gpi.preval.model.AccountVerificationRequest;
import com.swift.gpi.preval.model.AccountVerificationResponse1;
import com.swift.gpi.preval.model.ErrorCodeConsumer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyAccountApi {
    private ApiClient apiClient;

    public VerifyAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VerifyAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for verifyAccount
     * @param body Verify Account Details Request. (required)
     * @param laUApplicationID ID that identifies the application generating the API and used by the gpi Connector to retrieve the related LAU keys, required for consumers using gpi connector only (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release, required for consumers using gpi connector only (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ, required for consumers using gpi connector only (required)
     * @param laURequestNonce a random value generated by the client consumer. Provided with the request and copied by the gpi Connector on the response, required for consumers using gpi connector only (required)
     * @param laUSigned service specific HTTP headers composed of apiKey, rbac role and bic to route the request, required for consumers using gpi connector only (required)
     * @param laUSignature contains the LAU (SHA256) signature, base64 encoded, required for consumers using gpi connector only (required)
     * @param xBic describe the BIC for SWIFT to route the request, providers get the value and consumers are not required to fill it in (optional)
     * @param subjectDN describe the distinguish name of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @param institution describe the BIC of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call verifyAccountCall(AccountVerificationRequest body, String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xBic, String subjectDN, String institution, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/accounts/verification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (laUApplicationID != null)
        localVarHeaderParams.put("LAUApplicationID", apiClient.parameterToString(laUApplicationID));
        if (laUVersion != null)
        localVarHeaderParams.put("LAUVersion", apiClient.parameterToString(laUVersion));
        if (laUCallTime != null)
        localVarHeaderParams.put("LAUCallTime", apiClient.parameterToString(laUCallTime));
        if (laURequestNonce != null)
        localVarHeaderParams.put("LAURequestNonce", apiClient.parameterToString(laURequestNonce));
        if (laUSigned != null)
        localVarHeaderParams.put("LAUSigned", apiClient.parameterToString(laUSigned));
        if (laUSignature != null)
        localVarHeaderParams.put("LAUSignature", apiClient.parameterToString(laUSignature));
        if (xBic != null)
        localVarHeaderParams.put("x-bic", apiClient.parameterToString(xBic));
        if (subjectDN != null)
        localVarHeaderParams.put("SubjectDN", apiClient.parameterToString(subjectDN));
        if (institution != null)
        localVarHeaderParams.put("Institution", apiClient.parameterToString(institution));
        localVarHeaderParams.put("x-api-key", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B");

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "SwiftLAU" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call verifyAccountValidateBeforeCall(AccountVerificationRequest body, String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xBic, String subjectDN, String institution, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling verifyAccount(Async)");
        }
        // verify the required parameter 'laUApplicationID' is set
        if (laUApplicationID == null) {
            throw new ApiException("Missing the required parameter 'laUApplicationID' when calling verifyAccount(Async)");
        }
        // verify the required parameter 'laUVersion' is set
        if (laUVersion == null) {
            throw new ApiException("Missing the required parameter 'laUVersion' when calling verifyAccount(Async)");
        }
        // verify the required parameter 'laUCallTime' is set
        if (laUCallTime == null) {
            throw new ApiException("Missing the required parameter 'laUCallTime' when calling verifyAccount(Async)");
        }
        // verify the required parameter 'laURequestNonce' is set
        if (laURequestNonce == null) {
            throw new ApiException("Missing the required parameter 'laURequestNonce' when calling verifyAccount(Async)");
        }
        // verify the required parameter 'laUSigned' is set
        if (laUSigned == null) {
            throw new ApiException("Missing the required parameter 'laUSigned' when calling verifyAccount(Async)");
        }
        // verify the required parameter 'laUSignature' is set
        if (laUSignature == null) {
            throw new ApiException("Missing the required parameter 'laUSignature' when calling verifyAccount(Async)");
        }
        
        com.squareup.okhttp.Call call = verifyAccountCall(body, laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xBic, subjectDN, institution, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Verify that a beneficiary account could be able to receive incoming funds.
     * The service verifies that an account exists at the beneficiary bank and is capable of receiving incoming funds. This usually implies that the account is open, properly identified by the given number and, depending on the  jurisdiction and the market practices in use where the account is held, that the creditor name matches the name of the account holder. The service provider does not take liability for the response and does not provide any guarantee on the outcome of an actual transaction being sent to this account. The information provided is meant to be as accurate as possible at the time that the request was processed.  The requester must pass the creditor name and the service provider can use this information as part of the verification or not. 
     * @param body Verify Account Details Request. (required)
     * @param laUApplicationID ID that identifies the application generating the API and used by the gpi Connector to retrieve the related LAU keys, required for consumers using gpi connector only (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release, required for consumers using gpi connector only (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ, required for consumers using gpi connector only (required)
     * @param laURequestNonce a random value generated by the client consumer. Provided with the request and copied by the gpi Connector on the response, required for consumers using gpi connector only (required)
     * @param laUSigned service specific HTTP headers composed of apiKey, rbac role and bic to route the request, required for consumers using gpi connector only (required)
     * @param laUSignature contains the LAU (SHA256) signature, base64 encoded, required for consumers using gpi connector only (required)
     * @param xBic describe the BIC for SWIFT to route the request, providers get the value and consumers are not required to fill it in (optional)
     * @param subjectDN describe the distinguish name of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @param institution describe the BIC of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @return AccountVerificationResponse1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountVerificationResponse1 verifyAccount(AccountVerificationRequest body, String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xBic, String subjectDN, String institution) throws ApiException {
        ApiResponse<AccountVerificationResponse1> resp = verifyAccountWithHttpInfo(body, laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xBic, subjectDN, institution);
        return resp.getData();
    }

    /**
     * Verify that a beneficiary account could be able to receive incoming funds.
     * The service verifies that an account exists at the beneficiary bank and is capable of receiving incoming funds. This usually implies that the account is open, properly identified by the given number and, depending on the  jurisdiction and the market practices in use where the account is held, that the creditor name matches the name of the account holder. The service provider does not take liability for the response and does not provide any guarantee on the outcome of an actual transaction being sent to this account. The information provided is meant to be as accurate as possible at the time that the request was processed.  The requester must pass the creditor name and the service provider can use this information as part of the verification or not. 
     * @param body Verify Account Details Request. (required)
     * @param laUApplicationID ID that identifies the application generating the API and used by the gpi Connector to retrieve the related LAU keys, required for consumers using gpi connector only (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release, required for consumers using gpi connector only (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ, required for consumers using gpi connector only (required)
     * @param laURequestNonce a random value generated by the client consumer. Provided with the request and copied by the gpi Connector on the response, required for consumers using gpi connector only (required)
     * @param laUSigned service specific HTTP headers composed of apiKey, rbac role and bic to route the request, required for consumers using gpi connector only (required)
     * @param laUSignature contains the LAU (SHA256) signature, base64 encoded, required for consumers using gpi connector only (required)
     * @param xBic describe the BIC for SWIFT to route the request, providers get the value and consumers are not required to fill it in (optional)
     * @param subjectDN describe the distinguish name of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @param institution describe the BIC of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @return ApiResponse&lt;AccountVerificationResponse1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountVerificationResponse1> verifyAccountWithHttpInfo(AccountVerificationRequest body, String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xBic, String subjectDN, String institution) throws ApiException {
        com.squareup.okhttp.Call call = verifyAccountValidateBeforeCall(body, laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xBic, subjectDN, institution, null, null);
        Type localVarReturnType = new TypeToken<AccountVerificationResponse1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify that a beneficiary account could be able to receive incoming funds. (asynchronously)
     * The service verifies that an account exists at the beneficiary bank and is capable of receiving incoming funds. This usually implies that the account is open, properly identified by the given number and, depending on the  jurisdiction and the market practices in use where the account is held, that the creditor name matches the name of the account holder. The service provider does not take liability for the response and does not provide any guarantee on the outcome of an actual transaction being sent to this account. The information provided is meant to be as accurate as possible at the time that the request was processed.  The requester must pass the creditor name and the service provider can use this information as part of the verification or not. 
     * @param body Verify Account Details Request. (required)
     * @param laUApplicationID ID that identifies the application generating the API and used by the gpi Connector to retrieve the related LAU keys, required for consumers using gpi connector only (required)
     * @param laUVersion version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release, required for consumers using gpi connector only (required)
     * @param laUCallTime timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ, required for consumers using gpi connector only (required)
     * @param laURequestNonce a random value generated by the client consumer. Provided with the request and copied by the gpi Connector on the response, required for consumers using gpi connector only (required)
     * @param laUSigned service specific HTTP headers composed of apiKey, rbac role and bic to route the request, required for consumers using gpi connector only (required)
     * @param laUSignature contains the LAU (SHA256) signature, base64 encoded, required for consumers using gpi connector only (required)
     * @param xBic describe the BIC for SWIFT to route the request, providers get the value and consumers are not required to fill it in (optional)
     * @param subjectDN describe the distinguish name of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @param institution describe the BIC of the consumer, providers get the value and consumers are not required to fill it in (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call verifyAccountAsync(AccountVerificationRequest body, String laUApplicationID, String laUVersion, String laUCallTime, String laURequestNonce, String laUSigned, String laUSignature, String xBic, String subjectDN, String institution, final ApiCallback<AccountVerificationResponse1> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = verifyAccountValidateBeforeCall(body, laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xBic, subjectDN, institution, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountVerificationResponse1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
