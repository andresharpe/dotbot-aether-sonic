package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(C2174z c2174z) {
        boolean isSameFile;
        for (C2174z c4 = c2174z.c(); c4 != null; c4 = c4.c()) {
            if (c4.b() == null || c2174z.b() == null) {
                try {
                    isSameFile = Files.isSameFile(c4.d(), c2174z.d());
                    if (isSameFile) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (kotlin.jvm.internal.F.g(c4.b(), c2174z.b())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Path path, LinkOption[] linkOptionArr) {
        BasicFileAttributes readAttributes;
        Object fileKey;
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) N.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            kotlin.jvm.internal.F.o(readAttributes, "readAttributes(...)");
            fileKey = readAttributes.fileKey();
            return fileKey;
        } catch (Throwable unused) {
            return null;
        }
    }
}
