package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.json.JsonUtils;
import com.amazonaws.util.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class o implements m<AmazonServiceException> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f23684b = "x-amzn-ErrorType";

    /* renamed from: c, reason: collision with root package name */
    private static final int f23685c = 500;

    /* renamed from: a, reason: collision with root package name */
    private final List<? extends com.amazonaws.transform.b> f23686a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f23687a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23688b = b("message");

        /* renamed from: c, reason: collision with root package name */
        private final String f23689c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, String> f23690d;

        private a(int i4, String str, Map<String, String> map) {
            this.f23687a = i4;
            this.f23689c = str;
            this.f23690d = map;
        }

        public static a a(l lVar) throws IOException {
            int e4 = lVar.e();
            Map<String, String> d4 = JsonUtils.d(new BufferedReader(new InputStreamReader(lVar.b(), w.f24366b)));
            String str = lVar.c().get(o.f23684b);
            if (str != null) {
                int indexOf = str.indexOf(58);
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                }
            } else if (d4.containsKey("__type")) {
                String str2 = d4.get("__type");
                str = str2.substring(str2.lastIndexOf("#") + 1);
            }
            return new a(e4, str, d4);
        }

        public String b(String str) {
            if (str != null && str.length() != 0) {
                String str2 = w.n(str.substring(0, 1)) + str.substring(1);
                String str3 = w.u(str.substring(0, 1)) + str.substring(1);
                if (this.f23690d.containsKey(str3)) {
                    return this.f23690d.get(str3);
                }
                if (this.f23690d.containsKey(str2)) {
                    return this.f23690d.get(str2);
                }
                return "";
            }
            return null;
        }

        public String c() {
            return this.f23689c;
        }

        public String d() {
            return this.f23688b;
        }

        public int e() {
            return this.f23687a;
        }
    }

    public o(List<? extends com.amazonaws.transform.b> list) {
        this.f23686a = list;
    }

    private AmazonServiceException d(a aVar) throws Exception {
        for (com.amazonaws.transform.b bVar : this.f23686a) {
            if (bVar.c(aVar)) {
                return bVar.a(aVar);
            }
        }
        return null;
    }

    @Override // com.amazonaws.http.m
    public boolean b() {
        return false;
    }

    @Override // com.amazonaws.http.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AmazonServiceException a(l lVar) throws Exception {
        try {
            a a4 = a.a(lVar);
            AmazonServiceException d4 = d(a4);
            if (d4 == null) {
                return null;
            }
            d4.m(lVar.e());
            if (lVar.e() < 500) {
                d4.j(AmazonServiceException.ErrorType.Client);
            } else {
                d4.j(AmazonServiceException.ErrorType.Service);
            }
            d4.h(a4.c());
            for (Map.Entry<String, String> entry : lVar.c().entrySet()) {
                if ("X-Amzn-RequestId".equalsIgnoreCase(entry.getKey())) {
                    d4.k(entry.getValue());
                }
            }
            return d4;
        } catch (IOException e4) {
            throw new AmazonClientException("Unable to parse error response", e4);
        }
    }
}
