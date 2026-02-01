package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class q extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@l3.d File file) {
        super(file, null, null, 6, null);
        F.p(file, "file");
    }
}
