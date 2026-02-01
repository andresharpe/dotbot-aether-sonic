package androidx.preference;

import androidx.annotation.P;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g {
    public boolean a(String str, boolean z3) {
        return z3;
    }

    public float b(String str, float f4) {
        return f4;
    }

    public int c(String str, int i4) {
        return i4;
    }

    public long d(String str, long j4) {
        return j4;
    }

    @P
    public String e(String str, @P String str2) {
        return str2;
    }

    @P
    public Set<String> f(String str, @P Set<String> set) {
        return set;
    }

    public void g(String str, boolean z3) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void h(String str, float f4) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void i(String str, int i4) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void j(String str, long j4) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void k(String str, @P String str2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void l(String str, @P Set<String> set) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
}
