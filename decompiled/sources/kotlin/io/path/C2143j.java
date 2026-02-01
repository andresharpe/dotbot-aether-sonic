package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.C2096k;

@kotlin.jvm.internal.U({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* renamed from: kotlin.io.path.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2143j extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f52227a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private C2174z f52228b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private C2096k<C2174z> f52229c = new C2096k<>();

    public C2143j(boolean z3) {
        this.f52227a = z3;
    }

    public final boolean a() {
        return this.f52227a;
    }

    @l3.d
    public FileVisitResult b(@l3.d Path dir, @l3.d BasicFileAttributes attrs) {
        Object fileKey;
        kotlin.jvm.internal.F.p(dir, "dir");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        fileKey = attrs.fileKey();
        this.f52229c.add(new C2174z(dir, fileKey, this.f52228b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.F.o(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    @l3.d
    public final List<C2174z> c(@l3.d C2174z directoryNode) {
        kotlin.jvm.internal.F.p(directoryNode, "directoryNode");
        this.f52228b = directoryNode;
        Files.walkFileTree(directoryNode.d(), C2172y.f52243a.b(this.f52227a), 1, C2139h.a(this));
        this.f52229c.removeFirst();
        C2096k<C2174z> c2096k = this.f52229c;
        this.f52229c = new C2096k<>();
        return c2096k;
    }

    @l3.d
    public FileVisitResult d(@l3.d Path file, @l3.d BasicFileAttributes attrs) {
        kotlin.jvm.internal.F.p(file, "file");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        this.f52229c.add(new C2174z(file, null, this.f52228b));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.F.o(visitFile, "visitFile(...)");
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(C2137g.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return d(C2137g.a(obj), basicFileAttributes);
    }
}
