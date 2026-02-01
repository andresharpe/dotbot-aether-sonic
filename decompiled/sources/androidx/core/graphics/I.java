package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import java.util.Collection;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class I {
    @l3.d
    @androidx.annotation.W(19)
    public static final Path a(@l3.d Path path, @l3.d Path p4) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        Path path2 = new Path();
        path2.op(path, p4, Path.Op.INTERSECT);
        return path2;
    }

    @l3.d
    @androidx.annotation.W(26)
    public static final Iterable<K> b(@l3.d Path path, float f4) {
        kotlin.jvm.internal.F.p(path, "<this>");
        Collection<K> b4 = L.b(path, f4);
        kotlin.jvm.internal.F.o(b4, "flatten(this, error)");
        return b4;
    }

    public static /* synthetic */ Iterable c(Path path, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.5f;
        }
        return b(path, f4);
    }

    @l3.d
    @androidx.annotation.W(19)
    public static final Path d(@l3.d Path path, @l3.d Path p4) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.DIFFERENCE);
        return path2;
    }

    @l3.d
    @androidx.annotation.W(19)
    public static final Path e(@l3.d Path path, @l3.d Path p4) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.UNION);
        return path2;
    }

    @l3.d
    @androidx.annotation.W(19)
    public static final Path f(@l3.d Path path, @l3.d Path p4) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.UNION);
        return path2;
    }

    @l3.d
    @androidx.annotation.W(19)
    public static final Path g(@l3.d Path path, @l3.d Path p4) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        Path path2 = new Path(path);
        path2.op(p4, Path.Op.XOR);
        return path2;
    }
}
