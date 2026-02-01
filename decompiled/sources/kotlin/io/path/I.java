package kotlin.io.path;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

/* loaded from: classes2.dex */
final class I {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final I f52205a = new I();

    /* renamed from: b, reason: collision with root package name */
    private static final Path f52206b;

    /* renamed from: c, reason: collision with root package name */
    private static final Path f52207c;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        f52206b = path;
        path2 = Paths.get("..", new String[0]);
        f52207c = path2;
    }

    private I() {
    }

    @l3.d
    public final Path a(@l3.d Path path, @l3.d Path base) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        boolean J12;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        String A6;
        Path name;
        Path name2;
        kotlin.jvm.internal.F.p(path, "path");
        kotlin.jvm.internal.F.p(base, "base");
        normalize = base.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i4 = 0; i4 < min; i4++) {
            name = normalize.getName(i4);
            Path path2 = f52207c;
            if (!kotlin.jvm.internal.F.g(name, path2)) {
                break;
            }
            name2 = normalize2.getName(i4);
            if (!kotlin.jvm.internal.F.g(name2, path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (kotlin.jvm.internal.F.g(normalize2, normalize) || !kotlin.jvm.internal.F.g(normalize, f52206b)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            kotlin.jvm.internal.F.o(separator, "getSeparator(...)");
            J12 = kotlin.text.z.J1(obj, separator, false, 2, null);
            if (J12) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                A6 = kotlin.text.C.A6(obj, separator2.length());
                normalize2 = fileSystem2.getPath(A6, new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        kotlin.jvm.internal.F.m(normalize2);
        return normalize2;
    }
}
