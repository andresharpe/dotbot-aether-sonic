package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class l implements n, j {

    /* renamed from: d, reason: collision with root package name */
    private final String f21298d;

    /* renamed from: f, reason: collision with root package name */
    private final MergePaths f21300f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f21295a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f21296b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f21297c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List<n> f21299e = new ArrayList();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21301a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f21301a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21301a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21301a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21301a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21301a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(MergePaths mergePaths) {
        this.f21298d = mergePaths.c();
        this.f21300f = mergePaths;
    }

    private void a() {
        for (int i4 = 0; i4 < this.f21299e.size(); i4++) {
            this.f21297c.addPath(this.f21299e.get(i4).g());
        }
    }

    @TargetApi(19)
    private void c(Path.Op op) {
        this.f21296b.reset();
        this.f21295a.reset();
        for (int size = this.f21299e.size() - 1; size >= 1; size--) {
            n nVar = this.f21299e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> j4 = dVar.j();
                for (int size2 = j4.size() - 1; size2 >= 0; size2--) {
                    Path g4 = j4.get(size2).g();
                    g4.transform(dVar.k());
                    this.f21296b.addPath(g4);
                }
            } else {
                this.f21296b.addPath(nVar.g());
            }
        }
        n nVar2 = this.f21299e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> j5 = dVar2.j();
            for (int i4 = 0; i4 < j5.size(); i4++) {
                Path g5 = j5.get(i4).g();
                g5.transform(dVar2.k());
                this.f21295a.addPath(g5);
            }
        } else {
            this.f21295a.set(nVar2.g());
        }
        this.f21297c.op(this.f21295a, this.f21296b, op);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < this.f21299e.size(); i4++) {
            this.f21299e.get(i4).b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void e(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof n) {
                this.f21299e.add((n) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path g() {
        this.f21297c.reset();
        if (this.f21300f.d()) {
            return this.f21297c;
        }
        int i4 = a.f21301a[this.f21300f.b().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            c(Path.Op.XOR);
                        }
                    } else {
                        c(Path.Op.INTERSECT);
                    }
                } else {
                    c(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                c(Path.Op.UNION);
            }
        } else {
            a();
        }
        return this.f21297c;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21298d;
    }
}
