package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.P;
import androidx.annotation.S;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.C0738a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {

    @W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static final <T extends Parcelable> List<T> a(@androidx.annotation.N Parcel parcel, @androidx.annotation.N List<T> list, @P ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }
    }

    @W(30)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static final Parcelable.Creator<?> a(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    @W(33)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        public static <T> T[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            Object[] readArray;
            readArray = parcel.readArray(classLoader, cls);
            return (T[]) readArray;
        }

        @InterfaceC0577u
        public static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            ArrayList<T> readArrayList;
            readArrayList = parcel.readArrayList(classLoader, cls);
            return readArrayList;
        }

        @InterfaceC0577u
        public static <V, K> HashMap<K, V> c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            HashMap<K, V> readHashMap;
            readHashMap = parcel.readHashMap(classLoader, cls, cls2);
            return readHashMap;
        }

        @InterfaceC0577u
        public static <T> void d(@androidx.annotation.N Parcel parcel, @androidx.annotation.N List<? super T> list, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        @InterfaceC0577u
        public static <K, V> void e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @InterfaceC0577u
        static <T extends Parcelable> T f(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
            Object readParcelable;
            readParcelable = parcel.readParcelable(classLoader, cls);
            return (T) readParcelable;
        }

        @InterfaceC0577u
        static <T> T[] g(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
            Object[] readParcelableArray;
            readParcelableArray = parcel.readParcelableArray(classLoader, cls);
            return (T[]) readParcelableArray;
        }

        @InterfaceC0577u
        public static <T> Parcelable.Creator<T> h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            Parcelable.Creator<T> readParcelableCreator;
            readParcelableCreator = parcel.readParcelableCreator(classLoader, cls);
            return readParcelableCreator;
        }

        @InterfaceC0577u
        static <T> List<T> i(@androidx.annotation.N Parcel parcel, @androidx.annotation.N List<T> list, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
            List<T> readParcelableList;
            readParcelableList = parcel.readParcelableList(list, classLoader, cls);
            return readParcelableList;
        }

        @InterfaceC0577u
        static <T extends Serializable> T j(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
            Object readSerializable;
            readSerializable = parcel.readSerializable(classLoader, cls);
            return (T) readSerializable;
        }

        @InterfaceC0577u
        public static <T> SparseArray<T> k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            SparseArray<T> readSparseArray;
            readSparseArray = parcel.readSparseArray(classLoader, cls);
            return readSparseArray;
        }
    }

    private t() {
    }

    @P
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <T> T[] a(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
        if (C0738a.k()) {
            return (T[]) c.a(parcel, classLoader, cls);
        }
        return (T[]) parcel.readArray(classLoader);
    }

    @P
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <T> ArrayList<T> b(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<? extends T> cls) {
        if (C0738a.k()) {
            return c.b(parcel, classLoader, cls);
        }
        return parcel.readArrayList(classLoader);
    }

    public static boolean c(@androidx.annotation.N Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @P
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <K, V> HashMap<K, V> d(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<? extends K> cls, @androidx.annotation.N Class<? extends V> cls2) {
        if (C0738a.k()) {
            return c.c(parcel, classLoader, cls, cls2);
        }
        return parcel.readHashMap(classLoader);
    }

    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <T> void e(@androidx.annotation.N Parcel parcel, @androidx.annotation.N List<? super T> list, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
        if (C0738a.k()) {
            c.d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <K, V> void f(@androidx.annotation.N Parcel parcel, @androidx.annotation.N Map<? super K, ? super V> map, @P ClassLoader classLoader, @androidx.annotation.N Class<K> cls, @androidx.annotation.N Class<V> cls2) {
        if (C0738a.k()) {
            c.e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @P
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <T extends Parcelable> T g(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
        if (C0738a.k()) {
            return (T) c.f(parcel, classLoader, cls);
        }
        return (T) parcel.readParcelable(classLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @P
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <T> T[] h(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
        if (C0738a.k()) {
            return (T[]) c.g(parcel, classLoader, cls);
        }
        return (T[]) parcel.readParcelableArray(classLoader);
    }

    @P
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    @W(30)
    public static <T> Parcelable.Creator<T> i(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
        if (C0738a.k()) {
            return c.h(parcel, classLoader, cls);
        }
        return (Parcelable.Creator<T>) b.a(parcel, classLoader);
    }

    @androidx.annotation.N
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    @W(api = ConstraintLayout.b.a.f9571D)
    public static <T> List<T> j(@androidx.annotation.N Parcel parcel, @androidx.annotation.N List<T> list, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
        if (C0738a.k()) {
            return c.i(parcel, list, classLoader, cls);
        }
        return a.a(parcel, list, classLoader);
    }

    @P
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <T extends Serializable> T k(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<T> cls) {
        if (C0738a.k()) {
            return (T) c.j(parcel, classLoader, cls);
        }
        return (T) parcel.readSerializable();
    }

    @P
    @S(markerClass = {C0738a.InterfaceC0093a.class})
    public static <T> SparseArray<T> l(@androidx.annotation.N Parcel parcel, @P ClassLoader classLoader, @androidx.annotation.N Class<? extends T> cls) {
        if (C0738a.k()) {
            return c.k(parcel, classLoader, cls);
        }
        return parcel.readSparseArray(classLoader);
    }

    public static void m(@androidx.annotation.N Parcel parcel, boolean z3) {
        parcel.writeInt(z3 ? 1 : 0);
    }
}
