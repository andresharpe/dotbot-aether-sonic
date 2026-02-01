package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

@kotlin.Y(version = "1.7")
@InterfaceC2160s
/* renamed from: kotlin.io.path.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2162t {
    void a(@l3.d X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void b(@l3.d X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void c(@l3.d X2.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void d(@l3.d X2.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);
}
