package com.amazonaws.auth.policy.internal;

import com.amazonaws.auth.policy.Principal;
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.auth.policy.d;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.json.JsonUtils;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23489c = LogFactory.d("com.amazonaws.auth.policy");

    /* renamed from: a, reason: collision with root package name */
    private com.amazonaws.util.json.c f23490a;

    /* renamed from: b, reason: collision with root package name */
    private final Writer f23491b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, List<String>> f23492a = new HashMap();

        public void a(String str, List<String> list) {
            List<String> c4 = c(str);
            if (c4 == null) {
                this.f23492a.put(str, new ArrayList(list));
            } else {
                c4.addAll(list);
            }
        }

        public boolean b(String str) {
            return this.f23492a.containsKey(str);
        }

        public List<String> c(String str) {
            return this.f23492a.get(str);
        }

        public Map<String, List<String>> d() {
            return this.f23492a;
        }

        public Set<String> e() {
            return this.f23492a.keySet();
        }

        public void f(Map<String, List<String>> map) {
            this.f23492a = map;
        }
    }

    public c() {
        this.f23490a = null;
        StringWriter stringWriter = new StringWriter();
        this.f23491b = stringWriter;
        this.f23490a = JsonUtils.b(stringWriter);
    }

    private Map<String, a> a(List<com.amazonaws.auth.policy.b> list) {
        HashMap hashMap = new HashMap();
        for (com.amazonaws.auth.policy.b bVar : list) {
            String b4 = bVar.b();
            String a4 = bVar.a();
            if (!hashMap.containsKey(b4)) {
                hashMap.put(b4, new a());
            }
            ((a) hashMap.get(b4)).a(a4, bVar.c());
        }
        return hashMap;
    }

    private Map<String, List<String>> b(List<Principal> list) {
        HashMap hashMap = new HashMap();
        for (Principal principal : list) {
            String b4 = principal.b();
            if (!hashMap.containsKey(b4)) {
                hashMap.put(b4, new ArrayList());
            }
            ((List) hashMap.get(b4)).add(principal.a());
        }
        return hashMap;
    }

    private boolean c(Object obj) {
        return obj != null;
    }

    private String d(com.amazonaws.auth.policy.c cVar) throws IOException {
        this.f23490a.b();
        j(com.amazonaws.auth.policy.internal.a.f23474a, cVar.e());
        if (c(cVar.c())) {
            j(com.amazonaws.auth.policy.internal.a.f23475b, cVar.c());
        }
        i(com.amazonaws.auth.policy.internal.a.f23476c);
        for (Statement statement : cVar.d()) {
            this.f23490a.b();
            if (c(statement.d())) {
                j(com.amazonaws.auth.policy.internal.a.f23479f, statement.d());
            }
            j(com.amazonaws.auth.policy.internal.a.f23477d, statement.c().toString());
            List<Principal> e4 = statement.e();
            if (c(e4) && !e4.isEmpty()) {
                n(e4);
            }
            List<com.amazonaws.auth.policy.a> a4 = statement.a();
            if (c(a4) && !a4.isEmpty()) {
                e(a4);
            }
            List<d> f4 = statement.f();
            if (c(f4) && !f4.isEmpty()) {
                o(f4);
            }
            List<com.amazonaws.auth.policy.b> b4 = statement.b();
            if (c(b4) && !b4.isEmpty()) {
                f(b4);
            }
            this.f23490a.a();
        }
        h();
        this.f23490a.a();
        this.f23490a.flush();
        return this.f23491b.toString();
    }

    private void e(List<com.amazonaws.auth.policy.a> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator<com.amazonaws.auth.policy.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        g(com.amazonaws.auth.policy.internal.a.f23481h, arrayList);
    }

    private void f(List<com.amazonaws.auth.policy.b> list) throws IOException {
        Map<String, a> a4 = a(list);
        l(com.amazonaws.auth.policy.internal.a.f23483j);
        for (Map.Entry<String, a> entry : a4.entrySet()) {
            a aVar = a4.get(entry.getKey());
            l(entry.getKey());
            for (String str : aVar.e()) {
                g(str, aVar.c(str));
            }
            k();
        }
        k();
    }

    private void g(String str, List<String> list) throws IOException {
        i(str);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f23490a.g(it.next());
        }
        h();
    }

    private void h() throws IOException {
        this.f23490a.c();
    }

    private void i(String str) throws IOException {
        this.f23490a.l(str);
        this.f23490a.d();
    }

    private void j(String str, String str2) throws IOException {
        this.f23490a.l(str);
        this.f23490a.g(str2);
    }

    private void k() throws IOException {
        this.f23490a.a();
    }

    private void l(String str) throws IOException {
        this.f23490a.l(str);
        this.f23490a.b();
    }

    private void n(List<Principal> list) throws IOException {
        if (list.size() == 1) {
            Principal principal = list.get(0);
            Principal principal2 = Principal.f23450f;
            if (principal.equals(principal2)) {
                j(com.amazonaws.auth.policy.internal.a.f23480g, principal2.a());
                return;
            }
        }
        l(com.amazonaws.auth.policy.internal.a.f23480g);
        Map<String, List<String>> b4 = b(list);
        for (Map.Entry<String, List<String>> entry : b4.entrySet()) {
            List<String> list2 = b4.get(entry.getKey());
            if (list2.size() == 1) {
                j(entry.getKey(), list2.get(0));
            } else {
                g(entry.getKey(), list2);
            }
        }
        k();
    }

    private void o(List<d> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        g(com.amazonaws.auth.policy.internal.a.f23482i, arrayList);
    }

    public String m(com.amazonaws.auth.policy.c cVar) {
        try {
            if (c(cVar)) {
                try {
                    String d4 = d(cVar);
                    try {
                        this.f23491b.close();
                    } catch (Exception unused) {
                    }
                    return d4;
                } catch (Exception e4) {
                    throw new IllegalArgumentException("Unable to serialize policy to JSON string: " + e4.getMessage(), e4);
                }
            }
            throw new IllegalArgumentException("Policy cannot be null");
        } catch (Throwable th) {
            try {
                this.f23491b.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }
}
