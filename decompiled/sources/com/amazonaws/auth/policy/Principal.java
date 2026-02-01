package com.amazonaws.auth.policy;

/* loaded from: classes.dex */
public class Principal {

    /* renamed from: c, reason: collision with root package name */
    public static final Principal f23447c = new Principal("AWS", "*");

    /* renamed from: d, reason: collision with root package name */
    public static final Principal f23448d = new Principal("Service", "*");

    /* renamed from: e, reason: collision with root package name */
    public static final Principal f23449e = new Principal("Federated", "*");

    /* renamed from: f, reason: collision with root package name */
    public static final Principal f23450f = new Principal("*", "*");

    /* renamed from: a, reason: collision with root package name */
    private final String f23451a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23452b;

    /* loaded from: classes.dex */
    public enum Services {
        AWSDataPipeline("datapipeline.amazonaws.com"),
        AmazonElasticTranscoder("elastictranscoder.amazonaws.com"),
        AmazonEC2("ec2.amazonaws.com"),
        AWSOpsWorks("opsworks.amazonaws.com"),
        AWSCloudHSM("cloudhsm.amazonaws.com"),
        AllServices("*");

        private String serviceId;

        Services(String str) {
            this.serviceId = str;
        }

        public static Services b(String str) {
            if (str != null) {
                for (Services services : values()) {
                    if (services.e().equalsIgnoreCase(str)) {
                        return services;
                    }
                }
                return null;
            }
            return null;
        }

        public String e() {
            return this.serviceId;
        }
    }

    /* loaded from: classes.dex */
    public enum WebIdentityProviders {
        Facebook("graph.facebook.com"),
        Google("accounts.google.com"),
        Amazon("www.amazon.com"),
        AllProviders("*");

        private String webIdentityProvider;

        WebIdentityProviders(String str) {
            this.webIdentityProvider = str;
        }

        public static WebIdentityProviders b(String str) {
            if (str != null) {
                for (WebIdentityProviders webIdentityProviders : values()) {
                    if (webIdentityProviders.e().equalsIgnoreCase(str)) {
                        return webIdentityProviders;
                    }
                }
                return null;
            }
            return null;
        }

        public String e() {
            return this.webIdentityProvider;
        }
    }

    public Principal(Services services) {
        if (services != null) {
            this.f23451a = services.e();
            this.f23452b = "Service";
            return;
        }
        throw new IllegalArgumentException("Null AWS service name specified");
    }

    public String a() {
        return this.f23451a;
    }

    public String b() {
        return this.f23452b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Principal)) {
            return false;
        }
        Principal principal = (Principal) obj;
        if (b().equals(principal.b()) && a().equals(principal.a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23452b.hashCode() + 31) * 31) + this.f23451a.hashCode();
    }

    public Principal(String str, String str2) {
        this.f23452b = str;
        this.f23451a = "AWS".equals(str) ? str2.replaceAll("-", "") : str2;
    }

    public Principal(String str) {
        if (str != null) {
            this.f23451a = str.replaceAll("-", "");
            this.f23452b = "AWS";
            return;
        }
        throw new IllegalArgumentException("Null AWS account ID specified");
    }

    public Principal(WebIdentityProviders webIdentityProviders) {
        if (webIdentityProviders != null) {
            this.f23451a = webIdentityProviders.e();
            this.f23452b = "Federated";
            return;
        }
        throw new IllegalArgumentException("Null web identity provider specified");
    }
}
