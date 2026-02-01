package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.i0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@W(19)
/* loaded from: classes.dex */
public class q implements m {

    /* renamed from: d, reason: collision with root package name */
    private static final int f25921d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f25922e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f25923f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f25924g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f25925h;

    /* renamed from: i, reason: collision with root package name */
    private static final Bitmap.Config[] f25926i;

    /* renamed from: a, reason: collision with root package name */
    private final c f25927a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final h<b, Bitmap> f25928b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f25929c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25930a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f25930a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25930a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25930a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25930a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i4, Bitmap.Config config) {
            b b4 = b();
            b4.b(i4, config);
            return b4;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f25922e = configArr;
        f25923f = configArr;
        f25924g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f25925h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f25926i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void e(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j4 = j(bitmap.getConfig());
        Integer num2 = j4.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j4.remove(num);
                return;
            } else {
                j4.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
    }

    private b g(int i4, Bitmap.Config config) {
        b e4 = this.f25927a.e(i4, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i4));
            if (ceilingKey != null && ceilingKey.intValue() <= i4 * 8) {
                if (ceilingKey.intValue() == i4) {
                    if (config2 == null) {
                        if (config == null) {
                            return e4;
                        }
                    } else if (config2.equals(config)) {
                        return e4;
                    }
                }
                this.f25927a.c(e4);
                return this.f25927a.e(ceilingKey.intValue(), config2);
            }
        }
        return e4;
    }

    static String h(int i4, Bitmap.Config config) {
        return "[" + i4 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f25923f;
            }
        }
        int i4 = a.f25930a[config.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return new Bitmap.Config[]{config};
                    }
                    return f25926i;
                }
                return f25925h;
            }
            return f25924g;
        }
        return f25922e;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f25929c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f25929c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public String a(int i4, int i5, Bitmap.Config config) {
        return h(com.bumptech.glide.util.n.g(i4, i5, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.n.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public String c(Bitmap bitmap) {
        return h(com.bumptech.glide.util.n.h(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    public void d(Bitmap bitmap) {
        b e4 = this.f25927a.e(com.bumptech.glide.util.n.h(bitmap), bitmap.getConfig());
        this.f25928b.d(e4, bitmap);
        NavigableMap<Integer, Integer> j4 = j(bitmap.getConfig());
        Integer num = j4.get(Integer.valueOf(e4.f25932b));
        Integer valueOf = Integer.valueOf(e4.f25932b);
        int i4 = 1;
        if (num != null) {
            i4 = 1 + num.intValue();
        }
        j4.put(valueOf, Integer.valueOf(i4));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @P
    public Bitmap f(int i4, int i5, Bitmap.Config config) {
        b g4 = g(com.bumptech.glide.util.n.g(i4, i5, config), config);
        Bitmap a4 = this.f25928b.a(g4);
        if (a4 != null) {
            e(Integer.valueOf(g4.f25932b), a4);
            a4.reconfigure(i4, i5, config);
        }
        return a4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
    @P
    public Bitmap removeLast() {
        Bitmap f4 = this.f25928b.f();
        if (f4 != null) {
            e(Integer.valueOf(com.bumptech.glide.util.n.h(f4)), f4);
        }
        return f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f25928b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f25929c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f25929c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final c f25931a;

        /* renamed from: b, reason: collision with root package name */
        int f25932b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f25933c;

        public b(c cVar) {
            this.f25931a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.n
        public void a() {
            this.f25931a.c(this);
        }

        public void b(int i4, Bitmap.Config config) {
            this.f25932b = i4;
            this.f25933c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25932b != bVar.f25932b || !com.bumptech.glide.util.n.d(this.f25933c, bVar.f25933c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i4;
            int i5 = this.f25932b * 31;
            Bitmap.Config config = this.f25933c;
            if (config != null) {
                i4 = config.hashCode();
            } else {
                i4 = 0;
            }
            return i5 + i4;
        }

        public String toString() {
            return q.h(this.f25932b, this.f25933c);
        }

        @i0
        b(c cVar, int i4, Bitmap.Config config) {
            this(cVar);
            b(i4, config);
        }
    }
}
