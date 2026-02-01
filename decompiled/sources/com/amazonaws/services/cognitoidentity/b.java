package com.amazonaws.services.cognitoidentity;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.InterfaceC1029g;
import com.amazonaws.auth.InterfaceC1030h;
import com.amazonaws.auth.u;
import com.amazonaws.c;
import com.amazonaws.d;
import com.amazonaws.f;
import com.amazonaws.g;
import com.amazonaws.h;
import com.amazonaws.http.e;
import com.amazonaws.http.m;
import com.amazonaws.http.o;
import com.amazonaws.http.p;
import com.amazonaws.http.s;
import com.amazonaws.internal.l;
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
import com.amazonaws.services.cognitoidentity.model.transform.C1037c;
import com.amazonaws.services.cognitoidentity.model.transform.C1038d;
import com.amazonaws.services.cognitoidentity.model.transform.C1039e;
import com.amazonaws.services.cognitoidentity.model.transform.C1042h;
import com.amazonaws.services.cognitoidentity.model.transform.C1043i;
import com.amazonaws.services.cognitoidentity.model.transform.C1044j;
import com.amazonaws.services.cognitoidentity.model.transform.C1045k;
import com.amazonaws.services.cognitoidentity.model.transform.C1046l;
import com.amazonaws.services.cognitoidentity.model.transform.C1047m;
import com.amazonaws.services.cognitoidentity.model.transform.C1048n;
import com.amazonaws.services.cognitoidentity.model.transform.C1049o;
import com.amazonaws.services.cognitoidentity.model.transform.C1050p;
import com.amazonaws.services.cognitoidentity.model.transform.C1051q;
import com.amazonaws.services.cognitoidentity.model.transform.C1052s;
import com.amazonaws.services.cognitoidentity.model.transform.C1053t;
import com.amazonaws.services.cognitoidentity.model.transform.C1054u;
import com.amazonaws.services.cognitoidentity.model.transform.C1055v;
import com.amazonaws.services.cognitoidentity.model.transform.C1056w;
import com.amazonaws.services.cognitoidentity.model.transform.C1057x;
import com.amazonaws.services.cognitoidentity.model.transform.C1058y;
import com.amazonaws.services.cognitoidentity.model.transform.C1059z;
import com.amazonaws.services.cognitoidentity.model.transform.E;
import com.amazonaws.services.cognitoidentity.model.transform.F;
import com.amazonaws.services.cognitoidentity.model.transform.G;
import com.amazonaws.services.cognitoidentity.model.transform.H;
import com.amazonaws.services.cognitoidentity.model.transform.I;
import com.amazonaws.services.cognitoidentity.model.transform.J;
import com.amazonaws.services.cognitoidentity.model.transform.K;
import com.amazonaws.services.cognitoidentity.model.transform.L;
import com.amazonaws.services.cognitoidentity.model.transform.M;
import com.amazonaws.services.cognitoidentity.model.transform.N;
import com.amazonaws.services.cognitoidentity.model.transform.O;
import com.amazonaws.services.cognitoidentity.model.transform.P;
import com.amazonaws.services.cognitoidentity.model.transform.T;
import com.amazonaws.services.cognitoidentity.model.transform.U;
import com.amazonaws.services.cognitoidentity.model.transform.V;
import com.amazonaws.services.cognitoidentity.model.transform.W;
import com.amazonaws.services.cognitoidentity.model.transform.X;
import com.amazonaws.services.cognitoidentity.model.transform.c0;
import com.amazonaws.services.cognitoidentity.model.transform.d0;
import com.amazonaws.services.cognitoidentity.model.transform.e0;
import com.amazonaws.services.cognitoidentity.model.transform.f0;
import com.amazonaws.services.cognitoidentity.model.transform.g0;
import com.amazonaws.services.cognitoidentity.model.transform.h0;
import com.amazonaws.services.cognitoidentity.model.transform.k0;
import com.amazonaws.services.cognitoidentity.model.transform.l0;
import com.amazonaws.services.cognitoidentity.model.transform.m0;
import com.amazonaws.services.cognitoidentity.model.transform.n0;
import com.amazonaws.services.cognitoidentity.model.transform.r;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b extends com.amazonaws.a implements a {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1030h f23923o;

    /* renamed from: p, reason: collision with root package name */
    protected List<com.amazonaws.transform.b> f23924p;

    @Deprecated
    public b() {
        this(new u(), new d());
    }

    private static d t0(d dVar) {
        return dVar;
    }

    private void u0() {
        ArrayList arrayList = new ArrayList();
        this.f23924p = arrayList;
        arrayList.add(new C1037c());
        this.f23924p.add(new C1049o());
        this.f23924p.add(new C1050p());
        this.f23924p.add(new E());
        this.f23924p.add(new F());
        this.f23924p.add(new G());
        this.f23924p.add(new H());
        this.f23924p.add(new V());
        this.f23924p.add(new W());
        this.f23924p.add(new X());
        this.f23924p.add(new f0());
        this.f23924p.add(new com.amazonaws.transform.b());
        d("cognito-identity.us-east-1.amazonaws.com");
        this.f23368i = "cognito-identity";
        com.amazonaws.handlers.d dVar = new com.amazonaws.handlers.d();
        this.f23364e.addAll(dVar.c("/com/amazonaws/services/cognitoidentity/request.handlers"));
        this.f23364e.addAll(dVar.b("/com/amazonaws/services/cognitoidentity/request.handler2s"));
    }

    private <X, Y extends com.amazonaws.b> g<X> v0(f<Y> fVar, m<c<X>> mVar, e eVar) {
        fVar.w(this.f23360a);
        fVar.i(this.f23365f);
        AWSRequestMetrics a4 = eVar.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.CredentialsRequestTime;
        a4.n(field);
        try {
            InterfaceC1029g a5 = this.f23923o.a();
            a4.c(field);
            com.amazonaws.b k4 = fVar.k();
            if (k4 != null && k4.h() != null) {
                a5 = k4.h();
            }
            eVar.g(a5);
            return this.f23363d.d(fVar, mVar, new o(this.f23924p), eVar);
        } catch (Throwable th) {
            a4.c(AWSRequestMetrics.Field.CredentialsRequestTime);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public GetOpenIdTokenResult A(GetOpenIdTokenRequest getOpenIdTokenRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getOpenIdTokenRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<GetOpenIdTokenRequest> a5 = new C1058y().a(getOpenIdTokenRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1059z()), Q3);
                        GetOpenIdTokenResult getOpenIdTokenResult = (GetOpenIdTokenResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return getOpenIdTokenResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = getOpenIdTokenRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public ListTagsForResourceResult B(ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(listTagsForResourceRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<ListTagsForResourceRequest> a5 = new M().a(listTagsForResourceRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new N()), Q3);
                        ListTagsForResourceResult listTagsForResourceResult = (ListTagsForResourceResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return listTagsForResourceResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = listTagsForResourceRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public UntagResourceResult D(UntagResourceRequest untagResourceRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(untagResourceRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<UntagResourceRequest> a5 = new k0().a(untagResourceRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new l0()), Q3);
                        UntagResourceResult untagResourceResult = (UntagResourceResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return untagResourceResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = untagResourceRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public UpdateIdentityPoolResult F(UpdateIdentityPoolRequest updateIdentityPoolRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(updateIdentityPoolRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<UpdateIdentityPoolRequest> a5 = new m0().a(updateIdentityPoolRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new n0()), Q3);
                        UpdateIdentityPoolResult updateIdentityPoolResult = (UpdateIdentityPoolResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return updateIdentityPoolResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = updateIdentityPoolRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public MergeDeveloperIdentitiesResult G(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(mergeDeveloperIdentitiesRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<MergeDeveloperIdentitiesRequest> a5 = new T().a(mergeDeveloperIdentitiesRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new U()), Q3);
                        MergeDeveloperIdentitiesResult mergeDeveloperIdentitiesResult = (MergeDeveloperIdentitiesResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return mergeDeveloperIdentitiesResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = mergeDeveloperIdentitiesRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public DescribeIdentityResult H(DescribeIdentityRequest describeIdentityRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(describeIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<DescribeIdentityRequest> a5 = new C1047m().a(describeIdentityRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1048n()), Q3);
                        DescribeIdentityResult describeIdentityResult = (DescribeIdentityResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return describeIdentityResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = describeIdentityRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    @Override // com.amazonaws.services.cognitoidentity.a
    @Deprecated
    public h c(com.amazonaws.b bVar) {
        return this.f23363d.g(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public GetIdentityPoolRolesResult g(GetIdentityPoolRolesRequest getIdentityPoolRolesRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getIdentityPoolRolesRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<GetIdentityPoolRolesRequest> a5 = new C1054u().a(getIdentityPoolRolesRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1055v()), Q3);
                        GetIdentityPoolRolesResult getIdentityPoolRolesResult = (GetIdentityPoolRolesResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return getIdentityPoolRolesResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = getIdentityPoolRolesRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public CreateIdentityPoolResult h(CreateIdentityPoolRequest createIdentityPoolRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(createIdentityPoolRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<CreateIdentityPoolRequest> a5 = new C1038d().a(createIdentityPoolRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1039e()), Q3);
                        CreateIdentityPoolResult createIdentityPoolResult = (CreateIdentityPoolResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return createIdentityPoolResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = createIdentityPoolRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public GetIdResult i(GetIdRequest getIdRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getIdRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<GetIdRequest> a5 = new C1052s().a(getIdRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1053t()), Q3);
                        GetIdResult getIdResult = (GetIdResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return getIdResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = getIdRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public ListIdentityPoolsResult k(ListIdentityPoolsRequest listIdentityPoolsRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(listIdentityPoolsRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<ListIdentityPoolsRequest> a5 = new K().a(listIdentityPoolsRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new L()), Q3);
                        ListIdentityPoolsResult listIdentityPoolsResult = (ListIdentityPoolsResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return listIdentityPoolsResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = listIdentityPoolsRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public GetCredentialsForIdentityResult l(GetCredentialsForIdentityRequest getCredentialsForIdentityRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getCredentialsForIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<GetCredentialsForIdentityRequest> a5 = new C1051q().a(getCredentialsForIdentityRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new r()), Q3);
                        GetCredentialsForIdentityResult getCredentialsForIdentityResult = (GetCredentialsForIdentityResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return getCredentialsForIdentityResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = getCredentialsForIdentityRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public TagResourceResult m(TagResourceRequest tagResourceRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(tagResourceRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<TagResourceRequest> a5 = new d0().a(tagResourceRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new e0()), Q3);
                        TagResourceResult tagResourceResult = (TagResourceResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return tagResourceResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = tagResourceRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public DescribeIdentityPoolResult n(DescribeIdentityPoolRequest describeIdentityPoolRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(describeIdentityPoolRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<DescribeIdentityPoolRequest> a5 = new C1045k().a(describeIdentityPoolRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1046l()), Q3);
                        DescribeIdentityPoolResult describeIdentityPoolResult = (DescribeIdentityPoolResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return describeIdentityPoolResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = describeIdentityPoolRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazonaws.services.cognitoidentity.b, com.amazonaws.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest, com.amazonaws.b] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.amazonaws.f] */
    @Override // com.amazonaws.services.cognitoidentity.a
    public void o(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest) throws AmazonServiceException, AmazonClientException {
        e Q3 = Q(setIdentityPoolRolesRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<SetIdentityPoolRolesRequest> a5 = new c0().a(setIdentityPoolRolesRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        v0(a5, new p(null), Q3);
                        a4.c(field);
                        T(a4, a5, null, true);
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, setIdentityPoolRolesRequest, null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            setIdentityPoolRolesRequest = 0;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, setIdentityPoolRolesRequest, null, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazonaws.services.cognitoidentity.b, com.amazonaws.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest, com.amazonaws.b] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.amazonaws.f] */
    @Override // com.amazonaws.services.cognitoidentity.a
    public void q(UnlinkIdentityRequest unlinkIdentityRequest) throws AmazonServiceException, AmazonClientException {
        e Q3 = Q(unlinkIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<UnlinkIdentityRequest> a5 = new h0().a(unlinkIdentityRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        v0(a5, new p(null), Q3);
                        a4.c(field);
                        T(a4, a5, null, true);
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, unlinkIdentityRequest, null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            unlinkIdentityRequest = 0;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, unlinkIdentityRequest, null, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public GetOpenIdTokenForDeveloperIdentityResult r(GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getOpenIdTokenForDeveloperIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<GetOpenIdTokenForDeveloperIdentityRequest> a5 = new C1056w().a(getOpenIdTokenForDeveloperIdentityRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1057x()), Q3);
                        GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentityResult = (GetOpenIdTokenForDeveloperIdentityResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return getOpenIdTokenForDeveloperIdentityResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = getOpenIdTokenForDeveloperIdentityRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public LookupDeveloperIdentityResult u(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(lookupDeveloperIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<LookupDeveloperIdentityRequest> a5 = new O().a(lookupDeveloperIdentityRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new P()), Q3);
                        LookupDeveloperIdentityResult lookupDeveloperIdentityResult = (LookupDeveloperIdentityResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return lookupDeveloperIdentityResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = lookupDeveloperIdentityRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazonaws.services.cognitoidentity.b, com.amazonaws.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest, com.amazonaws.b] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.amazonaws.f] */
    @Override // com.amazonaws.services.cognitoidentity.a
    public void v(DeleteIdentityPoolRequest deleteIdentityPoolRequest) throws AmazonServiceException, AmazonClientException {
        e Q3 = Q(deleteIdentityPoolRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<DeleteIdentityPoolRequest> a5 = new C1044j().a(deleteIdentityPoolRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        v0(a5, new p(null), Q3);
                        a4.c(field);
                        T(a4, a5, null, true);
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, deleteIdentityPoolRequest, null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            deleteIdentityPoolRequest = 0;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, deleteIdentityPoolRequest, null, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public ListIdentitiesResult w(ListIdentitiesRequest listIdentitiesRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(listIdentitiesRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<ListIdentitiesRequest> a5 = new I().a(listIdentitiesRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new J()), Q3);
                        ListIdentitiesResult listIdentitiesResult = (ListIdentitiesResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return listIdentitiesResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = listIdentitiesRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazonaws.services.cognitoidentity.b, com.amazonaws.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest, com.amazonaws.b] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.amazonaws.f] */
    @Override // com.amazonaws.services.cognitoidentity.a
    public void x(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) throws AmazonServiceException, AmazonClientException {
        e Q3 = Q(unlinkDeveloperIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<UnlinkDeveloperIdentityRequest> a5 = new g0().a(unlinkDeveloperIdentityRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        v0(a5, new p(null), Q3);
                        a4.c(field);
                        T(a4, a5, null, true);
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, unlinkDeveloperIdentityRequest, null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            unlinkDeveloperIdentityRequest = 0;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, unlinkDeveloperIdentityRequest, null, true);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.cognitoidentity.a
    public DeleteIdentitiesResult y(DeleteIdentitiesRequest deleteIdentitiesRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(deleteIdentitiesRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        f<?> fVar = null;
        try {
            try {
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
                a4.n(field2);
                try {
                    f<DeleteIdentitiesRequest> a5 = new C1042h().a(deleteIdentitiesRequest);
                    try {
                        a5.q(a4);
                        a4.c(field2);
                        g<?> v02 = v0(a5, new p(new C1043i()), Q3);
                        DeleteIdentitiesResult deleteIdentitiesResult = (DeleteIdentitiesResult) v02.a();
                        a4.c(field);
                        T(a4, a5, v02, true);
                        return deleteIdentitiesResult;
                    } catch (Throwable th) {
                        th = th;
                        a4.c(AWSRequestMetrics.Field.RequestMarshallTime);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                gVar = null;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                T(a4, fVar, gVar, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fVar = deleteIdentitiesRequest;
            gVar = null;
            a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
            T(a4, fVar, gVar, true);
            throw th;
        }
    }

    @Deprecated
    public b(d dVar) {
        this(new u(), dVar);
    }

    public b(InterfaceC1029g interfaceC1029g) {
        this(interfaceC1029g, new d());
    }

    public b(InterfaceC1029g interfaceC1029g, d dVar) {
        this(new l(interfaceC1029g), dVar);
    }

    public b(InterfaceC1030h interfaceC1030h) {
        this(interfaceC1030h, new d());
    }

    public b(InterfaceC1030h interfaceC1030h, d dVar) {
        this(interfaceC1030h, dVar, new s(dVar));
    }

    @Deprecated
    public b(InterfaceC1030h interfaceC1030h, d dVar, com.amazonaws.metrics.g gVar) {
        super(t0(dVar), gVar);
        this.f23923o = interfaceC1030h;
        u0();
    }

    public b(InterfaceC1030h interfaceC1030h, d dVar, com.amazonaws.http.f fVar) {
        super(t0(dVar), fVar);
        this.f23923o = interfaceC1030h;
        u0();
    }
}
