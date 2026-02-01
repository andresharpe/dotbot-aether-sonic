package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.InterfaceC0569l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final short f31934a = 2;

    /* renamed from: b, reason: collision with root package name */
    private static final short f31935b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final short f31936c = 512;

    /* renamed from: d, reason: collision with root package name */
    private static final short f31937d = 513;

    /* renamed from: e, reason: collision with root package name */
    private static final short f31938e = 514;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f31939f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f31940g = Byte.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private static final String f31941h = "color";

    /* renamed from: i, reason: collision with root package name */
    private static byte f31942i;

    /* renamed from: j, reason: collision with root package name */
    private static final d f31943j = new d(1, "android");

    /* renamed from: k, reason: collision with root package name */
    private static final Comparator<b> f31944k = new a();

    /* loaded from: classes2.dex */
    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f31947c - bVar2.f31947c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final byte f31945a;

        /* renamed from: b, reason: collision with root package name */
        private final byte f31946b;

        /* renamed from: c, reason: collision with root package name */
        private final short f31947c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31948d;

        /* renamed from: e, reason: collision with root package name */
        @InterfaceC0569l
        private final int f31949e;

        b(int i4, String str, int i5) {
            this.f31948d = str;
            this.f31949e = i5;
            this.f31947c = (short) (65535 & i4);
            this.f31946b = (byte) ((i4 >> 16) & 255);
            this.f31945a = (byte) ((i4 >> 24) & 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: f, reason: collision with root package name */
        private static final short f31950f = 288;

        /* renamed from: g, reason: collision with root package name */
        private static final int f31951g = 128;

        /* renamed from: a, reason: collision with root package name */
        private final e f31952a;

        /* renamed from: b, reason: collision with root package name */
        private final d f31953b;

        /* renamed from: c, reason: collision with root package name */
        private final h f31954c = new h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* renamed from: d, reason: collision with root package name */
        private final h f31955d;

        /* renamed from: e, reason: collision with root package name */
        private final k f31956e;

        c(d dVar, List<b> list) {
            this.f31953b = dVar;
            String[] strArr = new String[list.size()];
            for (int i4 = 0; i4 < list.size(); i4++) {
                strArr[i4] = list.get(i4).f31948d;
            }
            this.f31955d = new h(true, strArr);
            this.f31956e = new k(list);
            this.f31952a = new e(i.f31936c, f31950f, a());
        }

        int a() {
            return this.f31954c.a() + 288 + this.f31955d.a() + this.f31956e.b();
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f31952a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(i.j(this.f31953b.f31957a));
            char[] charArray = this.f31953b.f31958b.toCharArray();
            for (int i4 = 0; i4 < 128; i4++) {
                if (i4 < charArray.length) {
                    byteArrayOutputStream.write(i.h(charArray[i4]));
                } else {
                    byteArrayOutputStream.write(i.h((char) 0));
                }
            }
            byteArrayOutputStream.write(i.j(288));
            byteArrayOutputStream.write(i.j(0));
            byteArrayOutputStream.write(i.j(this.f31954c.a() + 288));
            byteArrayOutputStream.write(i.j(0));
            byteArrayOutputStream.write(i.j(0));
            this.f31954c.c(byteArrayOutputStream);
            this.f31955d.c(byteArrayOutputStream);
            this.f31956e.c(byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f31957a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31958b;

        d(int i4, String str) {
            this.f31957a = i4;
            this.f31958b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final short f31959a;

        /* renamed from: b, reason: collision with root package name */
        private final short f31960b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31961c;

        e(short s4, short s5, int i4) {
            this.f31959a = s4;
            this.f31960b = s5;
            this.f31961c = i4;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(i.k(this.f31959a));
            byteArrayOutputStream.write(i.k(this.f31960b));
            byteArrayOutputStream.write(i.j(this.f31961c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: c, reason: collision with root package name */
        private static final short f31962c = 8;

        /* renamed from: d, reason: collision with root package name */
        private static final short f31963d = 2;

        /* renamed from: e, reason: collision with root package name */
        private static final short f31964e = 8;

        /* renamed from: f, reason: collision with root package name */
        private static final byte f31965f = 28;

        /* renamed from: g, reason: collision with root package name */
        private static final int f31966g = 16;

        /* renamed from: a, reason: collision with root package name */
        private final int f31967a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31968b;

        f(int i4, @InterfaceC0569l int i5) {
            this.f31967a = i4;
            this.f31968b = i5;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(i.k((short) 8));
            byteArrayOutputStream.write(i.k((short) 2));
            byteArrayOutputStream.write(i.j(this.f31967a));
            byteArrayOutputStream.write(i.k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, f31965f});
            byteArrayOutputStream.write(i.j(this.f31968b));
        }
    }

    /* loaded from: classes2.dex */
    private static class g {

        /* renamed from: e, reason: collision with root package name */
        private static final short f31969e = 12;

        /* renamed from: a, reason: collision with root package name */
        private final e f31970a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31971b;

        /* renamed from: d, reason: collision with root package name */
        private final List<c> f31973d = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final h f31972c = new h(new String[0]);

        g(Map<d, List<b>> map) {
            this.f31971b = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, i.f31944k);
                this.f31973d.add(new c(entry.getKey(), value));
            }
            this.f31970a = new e((short) 2, (short) 12, a());
        }

        private int a() {
            Iterator<c> it = this.f31973d.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i4 += it.next().a();
            }
            return this.f31972c.a() + 12 + i4;
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f31970a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(i.j(this.f31971b));
            this.f31972c.c(byteArrayOutputStream);
            Iterator<c> it = this.f31973d.iterator();
            while (it.hasNext()) {
                it.next().b(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: m, reason: collision with root package name */
        private static final short f31974m = 28;

        /* renamed from: n, reason: collision with root package name */
        private static final int f31975n = 256;

        /* renamed from: o, reason: collision with root package name */
        private static final int f31976o = -1;

        /* renamed from: a, reason: collision with root package name */
        private final e f31977a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31978b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31979c;

        /* renamed from: d, reason: collision with root package name */
        private final int f31980d;

        /* renamed from: e, reason: collision with root package name */
        private final int f31981e;

        /* renamed from: f, reason: collision with root package name */
        private final List<Integer> f31982f;

        /* renamed from: g, reason: collision with root package name */
        private final List<Integer> f31983g;

        /* renamed from: h, reason: collision with root package name */
        private final List<byte[]> f31984h;

        /* renamed from: i, reason: collision with root package name */
        private final List<List<C0282i>> f31985i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f31986j;

        /* renamed from: k, reason: collision with root package name */
        private final int f31987k;

        /* renamed from: l, reason: collision with root package name */
        private final int f31988l;

        h(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<C0282i>> b(String str) {
            return new Pair<>(this.f31986j ? i.m(str) : i.l(str), Collections.emptyList());
        }

        int a() {
            return this.f31988l;
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            int i4;
            this.f31977a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(i.j(this.f31978b));
            byteArrayOutputStream.write(i.j(this.f31979c));
            if (this.f31986j) {
                i4 = 256;
            } else {
                i4 = 0;
            }
            byteArrayOutputStream.write(i.j(i4));
            byteArrayOutputStream.write(i.j(this.f31980d));
            byteArrayOutputStream.write(i.j(this.f31981e));
            Iterator<Integer> it = this.f31982f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(i.j(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f31983g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(i.j(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f31984h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i5 = this.f31987k;
            if (i5 > 0) {
                byteArrayOutputStream.write(new byte[i5]);
            }
            Iterator<List<C0282i>> it4 = this.f31985i.iterator();
            while (it4.hasNext()) {
                Iterator<C0282i> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(i.j(-1));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        h(boolean z3, String... strArr) {
            this.f31982f = new ArrayList();
            this.f31983g = new ArrayList();
            this.f31984h = new ArrayList();
            this.f31985i = new ArrayList();
            this.f31986j = z3;
            int i4 = 0;
            for (String str : strArr) {
                Pair<byte[], List<C0282i>> b4 = b(str);
                this.f31982f.add(Integer.valueOf(i4));
                Object obj = b4.first;
                i4 += ((byte[]) obj).length;
                this.f31984h.add(obj);
                this.f31985i.add(b4.second);
            }
            int i5 = 0;
            for (List<C0282i> list : this.f31985i) {
                for (C0282i c0282i : list) {
                    this.f31982f.add(Integer.valueOf(i4));
                    i4 += c0282i.f31989a.length;
                    this.f31984h.add(c0282i.f31989a);
                }
                this.f31983g.add(Integer.valueOf(i5));
                i5 += (list.size() * 12) + 4;
            }
            int i6 = i4 % 4;
            int i7 = i6 == 0 ? 0 : 4 - i6;
            this.f31987k = i7;
            int size = this.f31984h.size();
            this.f31978b = size;
            this.f31979c = this.f31984h.size() - strArr.length;
            boolean z4 = this.f31984h.size() - strArr.length > 0;
            if (!z4) {
                this.f31983g.clear();
                this.f31985i.clear();
            }
            int size2 = (size * 4) + 28 + (this.f31983g.size() * 4);
            this.f31980d = size2;
            int i8 = i4 + i7;
            this.f31981e = z4 ? size2 + i8 : 0;
            int i9 = size2 + i8 + (z4 ? i5 : 0);
            this.f31988l = i9;
            this.f31977a = new e((short) 1, f31974m, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.color.i$i, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0282i {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f31989a;

        /* renamed from: b, reason: collision with root package name */
        private int f31990b;

        /* renamed from: c, reason: collision with root package name */
        private int f31991c;

        /* renamed from: d, reason: collision with root package name */
        private int f31992d;

        private C0282i() {
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(i.j(this.f31990b));
            byteArrayOutputStream.write(i.j(this.f31991c));
            byteArrayOutputStream.write(i.j(this.f31992d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class j {

        /* renamed from: f, reason: collision with root package name */
        private static final int f31993f = -1;

        /* renamed from: g, reason: collision with root package name */
        private static final short f31994g = 84;

        /* renamed from: h, reason: collision with root package name */
        private static final byte f31995h = 64;

        /* renamed from: a, reason: collision with root package name */
        private final e f31996a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31997b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f31998c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f31999d;

        /* renamed from: e, reason: collision with root package name */
        private final f[] f32000e;

        j(List<b> list, Set<Short> set, int i4) {
            byte[] bArr = new byte[64];
            this.f31998c = bArr;
            this.f31997b = i4;
            bArr[0] = f31995h;
            this.f32000e = new f[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                this.f32000e[i5] = new f(i5, list.get(i5).f31949e);
            }
            this.f31999d = new int[i4];
            int i6 = 0;
            for (short s4 = 0; s4 < i4; s4 = (short) (s4 + 1)) {
                if (set.contains(Short.valueOf(s4))) {
                    this.f31999d[s4] = i6;
                    i6 += 16;
                } else {
                    this.f31999d[s4] = -1;
                }
            }
            this.f31996a = new e(i.f31937d, f31994g, a());
        }

        private int b() {
            return c() + 84;
        }

        private int c() {
            return this.f31999d.length * 4;
        }

        int a() {
            return b() + (this.f32000e.length * 16);
        }

        void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f31996a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{i.f31942i, 0, 0, 0});
            byteArrayOutputStream.write(i.j(this.f31997b));
            byteArrayOutputStream.write(i.j(b()));
            byteArrayOutputStream.write(this.f31998c);
            for (int i4 : this.f31999d) {
                byteArrayOutputStream.write(i.j(i4));
            }
            for (f fVar : this.f32000e) {
                fVar.a(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class k {

        /* renamed from: e, reason: collision with root package name */
        private static final short f32001e = 16;

        /* renamed from: f, reason: collision with root package name */
        private static final int f32002f = 1073741824;

        /* renamed from: a, reason: collision with root package name */
        private final e f32003a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32004b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f32005c;

        /* renamed from: d, reason: collision with root package name */
        private final j f32006d;

        k(List<b> list) {
            this.f32004b = list.get(list.size() - 1).f31947c + 1;
            HashSet hashSet = new HashSet();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f31947c));
            }
            this.f32005c = new int[this.f32004b];
            for (short s4 = 0; s4 < this.f32004b; s4 = (short) (s4 + 1)) {
                if (hashSet.contains(Short.valueOf(s4))) {
                    this.f32005c[s4] = 1073741824;
                }
            }
            this.f32003a = new e(i.f31938e, (short) 16, a());
            this.f32006d = new j(list, hashSet, this.f32004b);
        }

        private int a() {
            return (this.f32004b * 4) + 16;
        }

        int b() {
            return a() + this.f32006d.a();
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f32003a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{i.f31942i, 0, 0, 0});
            byteArrayOutputStream.write(i.j(this.f32004b));
            for (int i4 : this.f32005c) {
                byteArrayOutputStream.write(i.j(i4));
            }
            this.f32006d.d(byteArrayOutputStream);
        }
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] h(char c4) {
        return new byte[]{(byte) (c4 & 255), (byte) ((c4 >> '\b') & 255)};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] i(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (!map.entrySet().isEmpty()) {
            d dVar2 = new d(kotlinx.coroutines.scheduling.q.f54649c, context.getPackageName());
            HashMap hashMap = new HashMap();
            b bVar = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
                if (context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                    if (bVar2.f31945a == 1) {
                        dVar = f31943j;
                    } else if (bVar2.f31945a == Byte.MAX_VALUE) {
                        dVar = dVar2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) bVar2.f31945a));
                    }
                    if (!hashMap.containsKey(dVar)) {
                        hashMap.put(dVar, new ArrayList());
                    }
                    ((List) hashMap.get(dVar)).add(bVar2);
                    bVar = bVar2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f31948d + ", typeId=" + Integer.toHexString(bVar2.f31946b & 255));
                }
            }
            byte b4 = bVar.f31946b;
            f31942i = b4;
            if (b4 != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new g(hashMap).b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] j(int i4) {
        return new byte[]{(byte) (i4 & 255), (byte) ((i4 >> 8) & 255), (byte) ((i4 >> 16) & 255), (byte) ((i4 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] k(short s4) {
        return new byte[]{(byte) (s4 & 255), (byte) ((s4 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] l(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] k4 = k((short) charArray.length);
        bArr[0] = k4[0];
        bArr[1] = k4[1];
        for (int i4 = 0; i4 < charArray.length; i4++) {
            byte[] h4 = h(charArray[i4]);
            int i5 = i4 * 2;
            bArr[i5 + 2] = h4[0];
            bArr[i5 + 3] = h4[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
