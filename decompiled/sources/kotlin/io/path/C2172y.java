package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

@kotlin.jvm.internal.U({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* renamed from: kotlin.io.path.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2172y {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C2172y f52243a = new C2172y();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final LinkOption[] f52244b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final LinkOption[] f52245c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final Set<FileVisitOption> f52246d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final Set<FileVisitOption> f52247e;

    static {
        LinkOption linkOption;
        Set<FileVisitOption> k4;
        FileVisitOption fileVisitOption;
        Set<FileVisitOption> f4;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        f52244b = new LinkOption[]{linkOption};
        f52245c = new LinkOption[0];
        k4 = kotlin.collections.j0.k();
        f52246d = k4;
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        f4 = kotlin.collections.i0.f(fileVisitOption);
        f52247e = f4;
    }

    private C2172y() {
    }

    @l3.d
    public final LinkOption[] a(boolean z3) {
        if (z3) {
            return f52245c;
        }
        return f52244b;
    }

    @l3.d
    public final Set<FileVisitOption> b(boolean z3) {
        if (z3) {
            return f52247e;
        }
        return f52246d;
    }
}
