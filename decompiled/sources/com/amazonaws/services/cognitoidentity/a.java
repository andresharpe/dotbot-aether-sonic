package com.amazonaws.services.cognitoidentity;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.h;
import com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest;
import com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult;
import com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest;
import com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult;
import com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest;
import com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest;
import com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult;
import com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest;
import com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult;
import com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest;
import com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult;
import com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest;
import com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult;
import com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult;
import com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest;
import com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult;
import com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest;
import com.amazonaws.services.cognitoidentity.model.TagResourceRequest;
import com.amazonaws.services.cognitoidentity.model.TagResourceResult;
import com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.UntagResourceRequest;
import com.amazonaws.services.cognitoidentity.model.UntagResourceResult;
import com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest;
import com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult;

/* loaded from: classes.dex */
public interface a {
    GetOpenIdTokenResult A(GetOpenIdTokenRequest getOpenIdTokenRequest) throws AmazonClientException, AmazonServiceException;

    ListTagsForResourceResult B(ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException, AmazonServiceException;

    UntagResourceResult D(UntagResourceRequest untagResourceRequest) throws AmazonClientException, AmazonServiceException;

    UpdateIdentityPoolResult F(UpdateIdentityPoolRequest updateIdentityPoolRequest) throws AmazonClientException, AmazonServiceException;

    MergeDeveloperIdentitiesResult G(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) throws AmazonClientException, AmazonServiceException;

    DescribeIdentityResult H(DescribeIdentityRequest describeIdentityRequest) throws AmazonClientException, AmazonServiceException;

    void a(com.amazonaws.regions.a aVar) throws IllegalArgumentException;

    h c(com.amazonaws.b bVar);

    void d(String str) throws IllegalArgumentException;

    GetIdentityPoolRolesResult g(GetIdentityPoolRolesRequest getIdentityPoolRolesRequest) throws AmazonClientException, AmazonServiceException;

    CreateIdentityPoolResult h(CreateIdentityPoolRequest createIdentityPoolRequest) throws AmazonClientException, AmazonServiceException;

    GetIdResult i(GetIdRequest getIdRequest) throws AmazonClientException, AmazonServiceException;

    ListIdentityPoolsResult k(ListIdentityPoolsRequest listIdentityPoolsRequest) throws AmazonClientException, AmazonServiceException;

    GetCredentialsForIdentityResult l(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) throws AmazonClientException, AmazonServiceException;

    TagResourceResult m(TagResourceRequest tagResourceRequest) throws AmazonClientException, AmazonServiceException;

    DescribeIdentityPoolResult n(DescribeIdentityPoolRequest describeIdentityPoolRequest) throws AmazonClientException, AmazonServiceException;

    void o(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest) throws AmazonClientException, AmazonServiceException;

    void q(UnlinkIdentityRequest unlinkIdentityRequest) throws AmazonClientException, AmazonServiceException;

    GetOpenIdTokenForDeveloperIdentityResult r(GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest) throws AmazonClientException, AmazonServiceException;

    void shutdown();

    LookupDeveloperIdentityResult u(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) throws AmazonClientException, AmazonServiceException;

    void v(DeleteIdentityPoolRequest deleteIdentityPoolRequest) throws AmazonClientException, AmazonServiceException;

    ListIdentitiesResult w(ListIdentitiesRequest listIdentitiesRequest) throws AmazonClientException, AmazonServiceException;

    void x(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) throws AmazonClientException, AmazonServiceException;

    DeleteIdentitiesResult y(DeleteIdentitiesRequest deleteIdentitiesRequest) throws AmazonClientException, AmazonServiceException;
}
