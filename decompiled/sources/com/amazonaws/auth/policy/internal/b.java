package com.amazonaws.auth.policy.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.policy.Principal;
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.auth.policy.d;
import com.amazonaws.util.json.JsonUtils;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f23484b = "AWS";

    /* renamed from: c, reason: collision with root package name */
    private static final String f23485c = "Service";

    /* renamed from: d, reason: collision with root package name */
    private static final String f23486d = "Federated";

    /* renamed from: a, reason: collision with root package name */
    private com.amazonaws.util.json.b f23487a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements com.amazonaws.auth.policy.a {

        /* renamed from: E, reason: collision with root package name */
        private final String f23488E;

        public a(String str) {
            this.f23488E = str;
        }

        @Override // com.amazonaws.auth.policy.a
        public String b() {
            return this.f23488E;
        }
    }

    private List<com.amazonaws.auth.policy.a> a(com.amazonaws.util.json.b bVar) throws IOException {
        LinkedList linkedList = new LinkedList();
        if (bVar.g()) {
            bVar.d();
            while (bVar.hasNext()) {
                linkedList.add(new a(bVar.e()));
            }
            bVar.c();
        } else {
            linkedList.add(new a(bVar.e()));
        }
        return linkedList;
    }

    private List<com.amazonaws.auth.policy.b> b(com.amazonaws.util.json.b bVar) throws IOException {
        LinkedList linkedList = new LinkedList();
        bVar.b();
        while (bVar.hasNext()) {
            c(linkedList, bVar.h(), bVar);
        }
        bVar.a();
        return linkedList;
    }

    private void c(List<com.amazonaws.auth.policy.b> list, String str, com.amazonaws.util.json.b bVar) throws IOException {
        bVar.b();
        while (bVar.hasNext()) {
            String h4 = bVar.h();
            LinkedList linkedList = new LinkedList();
            if (bVar.g()) {
                bVar.d();
                while (bVar.hasNext()) {
                    linkedList.add(bVar.e());
                }
                bVar.c();
            } else {
                linkedList.add(bVar.e());
            }
            list.add(new com.amazonaws.auth.policy.b().h(str).g(h4).i(linkedList));
        }
        bVar.a();
    }

    private Principal e(String str, String str2) {
        if (str.equalsIgnoreCase(f23484b)) {
            return new Principal(str2);
        }
        if (str.equalsIgnoreCase(f23485c)) {
            return new Principal(str, str2);
        }
        if (str.equalsIgnoreCase(f23486d)) {
            if (Principal.WebIdentityProviders.b(str2) != null) {
                return new Principal(Principal.WebIdentityProviders.b(str2));
            }
            return new Principal(f23486d, str2);
        }
        throw new AmazonClientException("Schema " + str + " is not a valid value for the principal.");
    }

    private List<Principal> f(com.amazonaws.util.json.b bVar) throws IOException {
        LinkedList linkedList = new LinkedList();
        if (bVar.g()) {
            bVar.b();
            while (bVar.hasNext()) {
                String h4 = bVar.h();
                if (bVar.g()) {
                    bVar.d();
                    while (bVar.hasNext()) {
                        linkedList.add(e(h4, bVar.e()));
                    }
                    bVar.c();
                } else {
                    linkedList.add(e(h4, bVar.e()));
                }
            }
            bVar.a();
        } else {
            String e4 = bVar.e();
            if ("*".equals(e4)) {
                linkedList.add(Principal.f23450f);
            } else {
                throw new IllegalArgumentException("Invalid principals: " + e4);
            }
        }
        return linkedList;
    }

    private List<d> g(com.amazonaws.util.json.b bVar) throws IOException {
        LinkedList linkedList = new LinkedList();
        if (bVar.g()) {
            bVar.d();
            while (bVar.hasNext()) {
                linkedList.add(new d(bVar.e()));
            }
            bVar.c();
        } else {
            linkedList.add(new d(bVar.e()));
        }
        return linkedList;
    }

    private Statement h(com.amazonaws.util.json.b bVar) throws IOException {
        Statement statement = new Statement(null);
        bVar.b();
        while (bVar.hasNext()) {
            String h4 = bVar.h();
            if (com.amazonaws.auth.policy.internal.a.f23477d.equals(h4)) {
                statement.i(Statement.Effect.valueOf(bVar.e()));
            } else if (com.amazonaws.auth.policy.internal.a.f23479f.equals(h4)) {
                statement.j(bVar.e());
            } else if (com.amazonaws.auth.policy.internal.a.f23481h.equals(h4)) {
                statement.g(a(bVar));
            } else if (com.amazonaws.auth.policy.internal.a.f23482i.equals(h4)) {
                statement.m(g(bVar));
            } else if (com.amazonaws.auth.policy.internal.a.f23480g.equals(h4)) {
                statement.k(f(bVar));
            } else if (com.amazonaws.auth.policy.internal.a.f23483j.equals(h4)) {
                statement.h(b(bVar));
            } else {
                bVar.f();
            }
        }
        bVar.a();
        if (statement.c() == null) {
            return null;
        }
        return statement;
    }

    public com.amazonaws.auth.policy.c d(String str) {
        if (str != null) {
            this.f23487a = JsonUtils.a(new StringReader(str));
            com.amazonaws.auth.policy.c cVar = new com.amazonaws.auth.policy.c();
            LinkedList linkedList = new LinkedList();
            try {
                try {
                    this.f23487a.b();
                    while (this.f23487a.hasNext()) {
                        String h4 = this.f23487a.h();
                        if (com.amazonaws.auth.policy.internal.a.f23475b.equals(h4)) {
                            cVar.f(this.f23487a.e());
                        } else if (com.amazonaws.auth.policy.internal.a.f23476c.equals(h4)) {
                            this.f23487a.d();
                            while (this.f23487a.hasNext()) {
                                linkedList.add(h(this.f23487a));
                            }
                            this.f23487a.c();
                        } else {
                            this.f23487a.f();
                        }
                    }
                    this.f23487a.a();
                    try {
                        this.f23487a.close();
                    } catch (IOException unused) {
                    }
                    cVar.g(linkedList);
                    return cVar;
                } catch (Exception e4) {
                    throw new IllegalArgumentException("Unable to generate policy object fron JSON string " + e4.getMessage(), e4);
                }
            } catch (Throwable th) {
                try {
                    this.f23487a.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("JSON string cannot be null");
    }
}
