package androidx.core.util;

import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.util.Objects;

/* loaded from: classes.dex */
public class p {

    @W(19)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @InterfaceC0577u
        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    private p() {
    }

    public static boolean a(@P Object obj, @P Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(@P Object... objArr) {
        return a.b(objArr);
    }

    public static int c(@P Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @N
    public static <T> T d(@P T t3) {
        t3.getClass();
        return t3;
    }

    @N
    public static <T> T e(@P T t3, @N String str) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(str);
    }

    @P
    public static String f(@P Object obj, @P String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }
}
