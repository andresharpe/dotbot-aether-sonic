package com.amazonaws.internal.config;

import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23736g = LogFactory.c(c.class);

    /* renamed from: h, reason: collision with root package name */
    private static final String f23737h = "/";

    /* renamed from: a, reason: collision with root package name */
    private final d f23738a = g();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, d> f23740c = d();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, d> f23741d = f();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, d> f23739b = e();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, b> f23742e = c();

    /* renamed from: f, reason: collision with root package name */
    private final List<com.amazonaws.internal.config.a> f23743f = b();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f23744a;

        static {
            try {
                f23744a = new c();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception e5) {
                throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Android SDK", e5);
            }
        }

        public static c a() {
            return f23744a;
        }
    }

    c() {
    }

    private static List<com.amazonaws.internal.config.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.amazonaws.internal.config.a("(.+\\.)?s3\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new com.amazonaws.internal.config.a("(.+\\.)?s3-external-1\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new com.amazonaws.internal.config.a("(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com", "us-gov-west-1"));
        return arrayList;
    }

    private static Map<String, b> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AmazonCloudWatchClient", new b(f.f23882d));
        hashMap.put("AmazonCloudWatchLogsClient", new b("logs"));
        hashMap.put("AmazonCognitoIdentityClient", new b("cognito-identity"));
        hashMap.put("AmazonCognitoIdentityProviderClient", new b("cognito-idp"));
        hashMap.put("AmazonCognitoSyncClient", new b("cognito-sync"));
        hashMap.put("AmazonComprehendClient", new b("comprehend"));
        hashMap.put("AmazonConnectClient", new b("connect"));
        hashMap.put("AmazonKinesisFirehoseClient", new b("firehose"));
        hashMap.put("AWSKinesisVideoArchivedMediaClient", new b("kinesisvideo"));
        hashMap.put("AWSKinesisVideoSignalingClient", new b("kinesisvideo"));
        hashMap.put("AWSIotClient", new b("execute-api"));
        hashMap.put("AmazonLexRuntimeClient", new b("runtime.lex"));
        hashMap.put("AmazonPinpointClient", new b("mobiletargeting"));
        hashMap.put("AmazonPinpointAnalyticsClient", new b("mobileanalytics"));
        hashMap.put("AmazonSageMakerRuntimeClient", new b("sagemaker"));
        hashMap.put("AmazonSimpleDBClient", new b(f.f23890l));
        hashMap.put("AmazonSimpleEmailServiceClient", new b("email"));
        hashMap.put("AWSSecurityTokenServiceClient", new b(f.f23898t));
        hashMap.put("AmazonTextractClient", new b("textract"));
        hashMap.put("AmazonTranscribeClient", new b("transcribe"));
        hashMap.put("AmazonTranslateClient", new b("translate"));
        return hashMap;
    }

    private static Map<String, d> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("eu-central-1", new d("AWS4SignerType"));
        hashMap.put("cn-north-1", new d("AWS4SignerType"));
        return hashMap;
    }

    private static Map<String, d> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("s3/eu-central-1", new d("AWSS3V4SignerType"));
        hashMap.put("s3/cn-north-1", new d("AWSS3V4SignerType"));
        hashMap.put("s3/us-east-2", new d("AWSS3V4SignerType"));
        hashMap.put("s3/ca-central-1", new d("AWSS3V4SignerType"));
        hashMap.put("s3/ap-south-1", new d("AWSS3V4SignerType"));
        hashMap.put("s3/ap-northeast-2", new d("AWSS3V4SignerType"));
        hashMap.put("s3/eu-west-2", new d("AWSS3V4SignerType"));
        return hashMap;
    }

    private static Map<String, d> f() {
        HashMap hashMap = new HashMap();
        hashMap.put(f.f23884f, new d("QueryStringSignerType"));
        hashMap.put("email", new d("AWS3SignerType"));
        hashMap.put(f.f23893o, new d("S3SignerType"));
        hashMap.put(f.f23890l, new d("QueryStringSignerType"));
        hashMap.put("runtime.lex", new d("AmazonLexV4Signer"));
        hashMap.put("polly", new d("AmazonPollyCustomPresigner"));
        return hashMap;
    }

    private static d g() {
        return new d("AWS4SignerType");
    }

    void a() {
        f23736g.a("defaultSignerConfig: " + this.f23738a + "\nserviceRegionSigners: " + this.f23739b + "\nregionSigners: " + this.f23740c + "\nserviceSigners: " + this.f23741d + "\nhostRegexToRegionMappings: " + this.f23743f);
    }

    public List<com.amazonaws.internal.config.a> h() {
        return Collections.unmodifiableList(this.f23743f);
    }

    public b i(String str) {
        return this.f23742e.get(str);
    }

    public d j(String str) {
        return k(str, null);
    }

    public d k(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                d dVar = this.f23739b.get(str + f23737h + str2);
                if (dVar != null) {
                    return dVar;
                }
                d dVar2 = this.f23740c.get(str2);
                if (dVar2 != null) {
                    return dVar2;
                }
            }
            d dVar3 = this.f23741d.get(str);
            if (dVar3 == null) {
                return this.f23738a;
            }
            return dVar3;
        }
        throw new IllegalArgumentException();
    }
}
