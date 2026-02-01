package com.amazonaws.services.securitytoken;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.InterfaceC1029g;
import com.amazonaws.auth.InterfaceC1030h;
import com.amazonaws.auth.u;
import com.amazonaws.d;
import com.amazonaws.g;
import com.amazonaws.h;
import com.amazonaws.http.e;
import com.amazonaws.http.r;
import com.amazonaws.regions.f;
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
import com.amazonaws.services.securitytoken.model.transform.A;
import com.amazonaws.services.securitytoken.model.transform.B;
import com.amazonaws.services.securitytoken.model.transform.C;
import com.amazonaws.services.securitytoken.model.transform.C1060a;
import com.amazonaws.services.securitytoken.model.transform.C1061b;
import com.amazonaws.services.securitytoken.model.transform.C1062c;
import com.amazonaws.services.securitytoken.model.transform.C1063d;
import com.amazonaws.services.securitytoken.model.transform.C1064e;
import com.amazonaws.services.securitytoken.model.transform.C1065f;
import com.amazonaws.services.securitytoken.model.transform.F;
import com.amazonaws.services.securitytoken.model.transform.p;
import com.amazonaws.services.securitytoken.model.transform.q;
import com.amazonaws.services.securitytoken.model.transform.s;
import com.amazonaws.services.securitytoken.model.transform.t;
import com.amazonaws.services.securitytoken.model.transform.v;
import com.amazonaws.services.securitytoken.model.transform.w;
import com.amazonaws.services.securitytoken.model.transform.x;
import com.amazonaws.services.securitytoken.model.transform.y;
import com.amazonaws.services.securitytoken.model.transform.z;
import com.amazonaws.transform.k;
import com.amazonaws.transform.l;
import com.amazonaws.transform.m;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class b extends com.amazonaws.a implements a {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1030h f24113o;

    /* renamed from: p, reason: collision with root package name */
    protected final List<m<AmazonServiceException, Node>> f24114p;

    @Deprecated
    public b() {
        this(new u(), new d());
    }

    private static d t0(d dVar) {
        return dVar;
    }

    private void u0() {
        this.f24114p.add(new com.amazonaws.services.securitytoken.model.transform.m());
        this.f24114p.add(new x());
        this.f24114p.add(new y());
        this.f24114p.add(new z());
        this.f24114p.add(new A());
        this.f24114p.add(new B());
        this.f24114p.add(new C());
        this.f24114p.add(new F());
        this.f24114p.add(new k());
        d("sts.amazonaws.com");
        this.f23368i = f.f23898t;
        com.amazonaws.handlers.d dVar = new com.amazonaws.handlers.d();
        this.f23364e.addAll(dVar.c("/com/amazonaws/services/securitytoken/request.handlers"));
        this.f23364e.addAll(dVar.b("/com/amazonaws/services/securitytoken/request.handler2s"));
    }

    private <X, Y extends com.amazonaws.b> g<X> v0(com.amazonaws.f<Y> fVar, m<X, l> mVar, e eVar) {
        fVar.w(this.f23360a);
        fVar.i(this.f23365f);
        com.amazonaws.b k4 = fVar.k();
        InterfaceC1029g a4 = this.f24113o.a();
        if (k4.h() != null) {
            a4 = k4.h();
        }
        eVar.g(a4);
        return this.f23363d.d(fVar, new r(mVar), new com.amazonaws.http.d(this.f24114p), eVar);
    }

    @Override // com.amazonaws.services.securitytoken.a
    public GetFederationTokenResult C(GetFederationTokenRequest getFederationTokenRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getFederationTokenRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<GetFederationTokenRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<GetFederationTokenRequest> a5 = new t().a(getFederationTokenRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new com.amazonaws.services.securitytoken.model.transform.u(), Q3);
                GetFederationTokenResult getFederationTokenResult = (GetFederationTokenResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return getFederationTokenResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.a
    public GetCallerIdentityResult E() throws AmazonServiceException, AmazonClientException {
        return f(new GetCallerIdentityRequest());
    }

    @Override // com.amazonaws.services.securitytoken.a
    public GetSessionTokenResult b() throws AmazonServiceException, AmazonClientException {
        return s(new GetSessionTokenRequest());
    }

    @Override // com.amazonaws.services.securitytoken.a
    @Deprecated
    public h c(com.amazonaws.b bVar) {
        return this.f23363d.g(bVar);
    }

    @Override // com.amazonaws.services.securitytoken.a
    public AssumeRoleWithSAMLResult e(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(assumeRoleWithSAMLRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<AssumeRoleWithSAMLRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<AssumeRoleWithSAMLRequest> a5 = new C1062c().a(assumeRoleWithSAMLRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new C1063d(), Q3);
                AssumeRoleWithSAMLResult assumeRoleWithSAMLResult = (AssumeRoleWithSAMLResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return assumeRoleWithSAMLResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.a
    public GetCallerIdentityResult f(GetCallerIdentityRequest getCallerIdentityRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getCallerIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<GetCallerIdentityRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<GetCallerIdentityRequest> a5 = new com.amazonaws.services.securitytoken.model.transform.r().a(getCallerIdentityRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new s(), Q3);
                GetCallerIdentityResult getCallerIdentityResult = (GetCallerIdentityResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return getCallerIdentityResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.a
    public AssumeRoleWithWebIdentityResult j(AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(assumeRoleWithWebIdentityRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<AssumeRoleWithWebIdentityRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<AssumeRoleWithWebIdentityRequest> a5 = new C1064e().a(assumeRoleWithWebIdentityRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new C1065f(), Q3);
                AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentityResult = (AssumeRoleWithWebIdentityResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return assumeRoleWithWebIdentityResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.a
    public DecodeAuthorizationMessageResult p(DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(decodeAuthorizationMessageRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<DecodeAuthorizationMessageRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<DecodeAuthorizationMessageRequest> a5 = new com.amazonaws.services.securitytoken.model.transform.k().a(decodeAuthorizationMessageRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new com.amazonaws.services.securitytoken.model.transform.l(), Q3);
                DecodeAuthorizationMessageResult decodeAuthorizationMessageResult = (DecodeAuthorizationMessageResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return decodeAuthorizationMessageResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.a
    public GetSessionTokenResult s(GetSessionTokenRequest getSessionTokenRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getSessionTokenRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<GetSessionTokenRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<GetSessionTokenRequest> a5 = new v().a(getSessionTokenRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new w(), Q3);
                GetSessionTokenResult getSessionTokenResult = (GetSessionTokenResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return getSessionTokenResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.a
    public GetAccessKeyInfoResult t(GetAccessKeyInfoRequest getAccessKeyInfoRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(getAccessKeyInfoRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<GetAccessKeyInfoRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<GetAccessKeyInfoRequest> a5 = new p().a(getAccessKeyInfoRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new q(), Q3);
                GetAccessKeyInfoResult getAccessKeyInfoResult = (GetAccessKeyInfoResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return getAccessKeyInfoResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
        }
    }

    @Override // com.amazonaws.services.securitytoken.a
    public AssumeRoleResult z(AssumeRoleRequest assumeRoleRequest) throws AmazonServiceException, AmazonClientException {
        g<?> gVar;
        e Q3 = Q(assumeRoleRequest);
        AWSRequestMetrics a4 = Q3.a();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        a4.n(field);
        com.amazonaws.f<AssumeRoleRequest> fVar = null;
        g<?> gVar2 = null;
        try {
            com.amazonaws.f<AssumeRoleRequest> a5 = new C1060a().a(assumeRoleRequest);
            try {
                a5.q(a4);
                gVar2 = v0(a5, new C1061b(), Q3);
                AssumeRoleResult assumeRoleResult = (AssumeRoleResult) gVar2.a();
                a4.c(field);
                S(a4, a5, gVar2);
                return assumeRoleResult;
            } catch (Throwable th) {
                th = th;
                g<?> gVar3 = gVar2;
                fVar = a5;
                gVar = gVar3;
                a4.c(AWSRequestMetrics.Field.ClientExecuteTime);
                S(a4, fVar, gVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = null;
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
        this(new com.amazonaws.internal.l(interfaceC1029g), dVar);
    }

    public b(InterfaceC1030h interfaceC1030h) {
        this(interfaceC1030h, new d());
    }

    public b(InterfaceC1030h interfaceC1030h, d dVar) {
        this(interfaceC1030h, dVar, new com.amazonaws.http.s(dVar));
    }

    @Deprecated
    public b(InterfaceC1030h interfaceC1030h, d dVar, com.amazonaws.metrics.g gVar) {
        super(t0(dVar), gVar);
        this.f24114p = new ArrayList();
        this.f24113o = interfaceC1030h;
        u0();
    }

    public b(InterfaceC1030h interfaceC1030h, d dVar, com.amazonaws.http.f fVar) {
        super(t0(dVar), fVar);
        this.f24114p = new ArrayList();
        this.f24113o = interfaceC1030h;
        u0();
    }
}
