package com.blankj.utilcode.util;

import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.format.Formatter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f25093a;

        /* renamed from: b, reason: collision with root package name */
        private String f25094b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f25095c;

        /* renamed from: d, reason: collision with root package name */
        private long f25096d;

        /* renamed from: e, reason: collision with root package name */
        private long f25097e;

        a(String str, String str2, boolean z3) {
            this.f25093a = str;
            this.f25094b = str2;
            this.f25095c = z3;
            this.f25096d = H0.S(str);
            this.f25097e = H0.R(str);
        }

        public long c() {
            return this.f25097e;
        }

        public String d() {
            return this.f25093a;
        }

        public String e() {
            return this.f25094b;
        }

        public long f() {
            return this.f25096d;
        }

        public boolean g() {
            return this.f25095c;
        }

        public String toString() {
            return "SDCardInfo {path = " + this.f25093a + ", state = " + this.f25094b + ", isRemovable = " + this.f25095c + ", totalSize = " + Formatter.formatFileSize(E0.a(), this.f25096d) + ", availableSize = " + Formatter.formatFileSize(E0.a(), this.f25097e) + '}';
        }
    }

    private n0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long a() {
        return H0.R(g());
    }

    public static long b() {
        return H0.S(g());
    }

    public static long c() {
        return H0.R(Environment.getDataDirectory().getAbsolutePath());
    }

    public static long d() {
        return H0.S(Environment.getDataDirectory().getAbsolutePath());
    }

    public static List<String> e() {
        ArrayList arrayList = new ArrayList();
        List<a> f4 = f();
        if (f4 != null && !f4.isEmpty()) {
            for (a aVar : f4) {
                String str = aVar.f25094b;
                if (str != null && "mounted".equals(str.toLowerCase())) {
                    arrayList.add(aVar.f25093a);
                }
            }
        }
        return arrayList;
    }

    public static List<a> f() {
        ArrayList arrayList = new ArrayList();
        StorageManager storageManager = (StorageManager) E0.a().getSystemService("storage");
        if (storageManager == null) {
            return arrayList;
        }
        List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
        try {
            Method method = StorageVolume.class.getMethod("getPath", new Class[0]);
            for (StorageVolume storageVolume : storageVolumes) {
                boolean isRemovable = storageVolume.isRemovable();
                arrayList.add(new a((String) method.invoke(storageVolume, new Object[0]), storageVolume.getState(), isRemovable));
            }
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
        return arrayList;
    }

    public static String g() {
        if (h()) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        return "";
    }

    public static boolean h() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
