package com.amazonaws.regions;

import com.amazonaws.i;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static List<a> f23874a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23875b = LogFactory.d("com.amazonaws.request");

    public static a a(String str) {
        for (a aVar : c()) {
            if (aVar.e().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static a b(String str) {
        String host = e(str).getHost();
        for (a aVar : c()) {
            Iterator<String> it = aVar.i().values().iterator();
            while (it.hasNext()) {
                if (e(it.next()).getHost().equals(host)) {
                    return aVar;
                }
            }
        }
        throw new IllegalArgumentException("No region found with any service for endpoint " + str);
    }

    public static synchronized List<a> c() {
        List<a> list;
        synchronized (e.class) {
            try {
                if (f23874a == null) {
                    f();
                }
                list = f23874a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public static synchronized List<a> d(String str) {
        LinkedList linkedList;
        synchronized (e.class) {
            linkedList = new LinkedList();
            for (a aVar : c()) {
                if (aVar.l(str)) {
                    linkedList.add(aVar);
                }
            }
        }
        return linkedList;
    }

    private static URI e(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null) {
                return new URI("http://" + str);
            }
            return uri;
        } catch (URISyntaxException e4) {
            throw new RuntimeException("Unable to parse service endpoint: " + e4.getMessage());
        }
    }

    public static synchronized void f() {
        synchronized (e.class) {
            if (System.getProperty(i.f23719f) != null) {
                try {
                    i();
                } catch (FileNotFoundException e4) {
                    throw new RuntimeException("Couldn't find regions override file specified", e4);
                }
            }
            if (f23874a == null) {
                h();
            }
            if (f23874a == null) {
                throw new RuntimeException("Failed to initialize the regions.");
            }
        }
    }

    private static void g(InputStream inputStream) {
        try {
            f23874a = new d().f(inputStream);
        } catch (Exception e4) {
            f23875b.j("Failed to parse regional endpoints", e4);
        }
    }

    private static void h() {
        com.amazonaws.logging.c cVar = f23875b;
        if (cVar.f()) {
            cVar.a("Initializing the regions with default regions");
        }
        f23874a = b.a();
    }

    private static void i() throws FileNotFoundException {
        String property = System.getProperty(i.f23719f);
        com.amazonaws.logging.c cVar = f23875b;
        if (cVar.f()) {
            cVar.a("Using local override of the regions file (" + property + ") to initiate regions data...");
        }
        g(new FileInputStream(new File(property)));
    }
}
