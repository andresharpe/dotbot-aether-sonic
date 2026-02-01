package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.H0;

/* loaded from: classes.dex */
public final class Q {

    /* loaded from: classes.dex */
    public static final class a implements Iterator<Rect>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final RegionIterator f12415E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final Rect f12416F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f12417G;

        a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f12415E = regionIterator;
            Rect rect = new Rect();
            this.f12416F = rect;
            this.f12417G = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (this.f12417G) {
                Rect rect = new Rect(this.f12416F);
                this.f12417G = this.f12415E.next(this.f12416F);
                return rect;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12417G;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @l3.d
    public static final Region a(@l3.d Region region, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.INTERSECT);
        return region2;
    }

    @l3.d
    public static final Region b(@l3.d Region region, @l3.d Region r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean c(@l3.d Region region, @l3.d Point p4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        return region.contains(p4.x, p4.y);
    }

    public static final void d(@l3.d Region region, @l3.d X2.l<? super Rect, H0> action) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                action.C(rect);
            }
        }
    }

    @l3.d
    public static final Iterator<Rect> e(@l3.d Region region) {
        kotlin.jvm.internal.F.p(region, "<this>");
        return new a(region);
    }

    @l3.d
    public static final Region f(@l3.d Region region, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.DIFFERENCE);
        return region2;
    }

    @l3.d
    public static final Region g(@l3.d Region region, @l3.d Region r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.DIFFERENCE);
        return region2;
    }

    @l3.d
    public static final Region h(@l3.d Region region) {
        kotlin.jvm.internal.F.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @l3.d
    public static final Region i(@l3.d Region region, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.union(r4);
        return region2;
    }

    @l3.d
    public static final Region j(@l3.d Region region, @l3.d Region r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.UNION);
        return region2;
    }

    @l3.d
    public static final Region k(@l3.d Region region, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.union(r4);
        return region2;
    }

    @l3.d
    public static final Region l(@l3.d Region region, @l3.d Region r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.UNION);
        return region2;
    }

    @l3.d
    public static final Region m(@l3.d Region region) {
        kotlin.jvm.internal.F.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @l3.d
    public static final Region n(@l3.d Region region, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.XOR);
        return region2;
    }

    @l3.d
    public static final Region o(@l3.d Region region, @l3.d Region r4) {
        kotlin.jvm.internal.F.p(region, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.XOR);
        return region2;
    }
}
