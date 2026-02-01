package com.amazonaws.regions;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f23865a;

    public c(List<a> list) {
        if (list != null) {
            this.f23865a = Collections.unmodifiableList(new ArrayList(list));
            return;
        }
        throw new IllegalArgumentException("regions cannot be null");
    }

    private static String a(String str) {
        String host = URI.create(str).getHost();
        if (host == null) {
            return URI.create("http://" + str).getHost();
        }
        return host;
    }

    public a b(String str) {
        for (a aVar : this.f23865a) {
            if (aVar.e().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public a c(String str) {
        String a4 = a(str);
        for (a aVar : this.f23865a) {
            Iterator<String> it = aVar.i().values().iterator();
            while (it.hasNext()) {
                if (a4.equals(a(it.next()))) {
                    return aVar;
                }
            }
        }
        throw new IllegalArgumentException("No region found with any service for endpoint " + str);
    }

    public List<a> d() {
        return this.f23865a;
    }

    public List<a> e(String str) {
        LinkedList linkedList = new LinkedList();
        for (a aVar : this.f23865a) {
            if (aVar.l(str)) {
                linkedList.add(aVar);
            }
        }
        return linkedList;
    }

    public String toString() {
        return this.f23865a.toString();
    }
}
