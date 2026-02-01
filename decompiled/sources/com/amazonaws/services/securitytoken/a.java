package com.amazonaws.services.securitytoken;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.h;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleResult;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest;
import com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult;
import com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest;
import com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityResult;
import com.amazonaws.services.securitytoken.model.GetFederationTokenRequest;
import com.amazonaws.services.securitytoken.model.GetFederationTokenResult;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;

/* loaded from: classes.dex */
public interface a {
    GetFederationTokenResult C(GetFederationTokenRequest getFederationTokenRequest) throws AmazonClientException, AmazonServiceException;

    GetCallerIdentityResult E() throws AmazonClientException, AmazonServiceException;

    void a(com.amazonaws.regions.a aVar) throws IllegalArgumentException;

    GetSessionTokenResult b() throws AmazonClientException, AmazonServiceException;

    h c(com.amazonaws.b bVar);

    void d(String str) throws IllegalArgumentException;

    AssumeRoleWithSAMLResult e(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) throws AmazonClientException, AmazonServiceException;

    GetCallerIdentityResult f(GetCallerIdentityRequest getCallerIdentityRequest) throws AmazonClientException, AmazonServiceException;

    AssumeRoleWithWebIdentityResult j(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) throws AmazonClientException, AmazonServiceException;

    DecodeAuthorizationMessageResult p(DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest) throws AmazonClientException, AmazonServiceException;

    GetSessionTokenResult s(GetSessionTokenRequest getSessionTokenRequest) throws AmazonClientException, AmazonServiceException;

    void shutdown();

    GetAccessKeyInfoResult t(GetAccessKeyInfoRequest getAccessKeyInfoRequest) throws AmazonClientException, AmazonServiceException;

    AssumeRoleResult z(AssumeRoleRequest assumeRoleRequest) throws AmazonClientException, AmazonServiceException;
}
