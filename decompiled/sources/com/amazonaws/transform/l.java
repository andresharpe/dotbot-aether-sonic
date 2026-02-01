package com.amazonaws.transform;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private int f24243a;

    /* renamed from: b, reason: collision with root package name */
    private final XmlPullParser f24244b;

    /* renamed from: c, reason: collision with root package name */
    public final Deque<String> f24245c;

    /* renamed from: d, reason: collision with root package name */
    private String f24246d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f24247e;

    /* renamed from: f, reason: collision with root package name */
    private List<a> f24248f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f24249g;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f24250a;

        /* renamed from: b, reason: collision with root package name */
        public int f24251b;

        /* renamed from: c, reason: collision with root package name */
        public String f24252c;

        public a(String str, int i4, String str2) {
            this.f24250a = str;
            this.f24251b = i4;
            this.f24252c = str2;
        }
    }

    public l(XmlPullParser xmlPullParser) {
        this(xmlPullParser, null);
    }

    private void j() {
        String peek;
        int i4 = this.f24243a;
        if (i4 == 2) {
            String str = this.f24246d + "/" + this.f24244b.getName();
            this.f24246d = str;
            this.f24245c.push(str);
            return;
        }
        if (i4 == 3) {
            this.f24245c.pop();
            if (this.f24245c.isEmpty()) {
                peek = "";
            } else {
                peek = this.f24245c.peek();
            }
            this.f24246d = peek;
        }
    }

    public int a() {
        return this.f24245c.size();
    }

    public String b(String str) {
        Map<String, String> map = this.f24249g;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, String> c() {
        return this.f24247e;
    }

    public boolean d() {
        if (this.f24243a == 0) {
            return true;
        }
        return false;
    }

    public int e() throws XmlPullParserException, IOException {
        int next = this.f24244b.next();
        this.f24243a = next;
        if (next == 4) {
            this.f24243a = this.f24244b.next();
        }
        j();
        if (this.f24243a == 2) {
            Iterator<a> it = this.f24248f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next2 = it.next();
                if (i(next2.f24250a, next2.f24251b)) {
                    this.f24247e.put(next2.f24252c, f());
                    break;
                }
            }
        }
        return this.f24243a;
    }

    public String f() throws XmlPullParserException, IOException {
        String nextText = this.f24244b.nextText();
        if (this.f24244b.getEventType() != 3) {
            this.f24244b.next();
        }
        this.f24243a = this.f24244b.getEventType();
        j();
        return nextText;
    }

    public void g(String str, int i4, String str2) {
        this.f24248f.add(new a(str, i4, str2));
    }

    public boolean h(String str) {
        return i(str, a());
    }

    public boolean i(String str, int i4) {
        if (".".equals(str)) {
            return true;
        }
        int i5 = -1;
        while (true) {
            i5 = str.indexOf("/", i5 + 1);
            if (i5 <= -1) {
                break;
            }
            if (str.charAt(i5 + 1) != '@') {
                i4++;
            }
        }
        if (a() == i4) {
            if (this.f24246d.endsWith("/" + str)) {
                return true;
            }
        }
        return false;
    }

    public l(XmlPullParser xmlPullParser, Map<String, String> map) {
        this.f24245c = new LinkedList();
        this.f24246d = "";
        this.f24247e = new HashMap();
        this.f24248f = new ArrayList();
        this.f24244b = xmlPullParser;
        this.f24249g = map;
    }
}
