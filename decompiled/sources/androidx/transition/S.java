package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class S {

    /* renamed from: b, reason: collision with root package name */
    public View f19960b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f19959a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<J> f19961c = new ArrayList<>();

    @Deprecated
    public S() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof S) {
            S s4 = (S) obj;
            if (this.f19960b == s4.f19960b && this.f19959a.equals(s4.f19959a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f19960b.hashCode() * 31) + this.f19959a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f19960b + "\n") + "    values:";
        for (String str2 : this.f19959a.keySet()) {
            str = str + "    " + str2 + ": " + this.f19959a.get(str2) + "\n";
        }
        return str;
    }

    public S(@androidx.annotation.N View view) {
        this.f19960b = view;
    }
}
