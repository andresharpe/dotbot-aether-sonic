package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
class l extends k {
    @l3.d
    public static final h J(@l3.d File file, @l3.d FileWalkDirection direction) {
        F.p(file, "<this>");
        F.p(direction, "direction");
        return new h(file, direction);
    }

    public static /* synthetic */ h K(File file, FileWalkDirection fileWalkDirection, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return J(file, fileWalkDirection);
    }

    @l3.d
    public static final h L(@l3.d File file) {
        F.p(file, "<this>");
        return J(file, FileWalkDirection.BOTTOM_UP);
    }

    @l3.d
    public static final h M(@l3.d File file) {
        F.p(file, "<this>");
        return J(file, FileWalkDirection.TOP_DOWN);
    }
}
