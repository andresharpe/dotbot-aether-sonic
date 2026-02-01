package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

/* loaded from: classes.dex */
public final class P {
    @l3.d
    public static final Rect A(@l3.d Rect rect, int i4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i4;
        rect2.left *= i4;
        rect2.right *= i4;
        rect2.bottom *= i4;
        return rect2;
    }

    @l3.d
    public static final RectF B(@l3.d RectF rectF, float f4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f4;
        rectF2.left *= f4;
        rectF2.right *= f4;
        rectF2.bottom *= f4;
        return rectF2;
    }

    @l3.d
    public static final RectF C(@l3.d RectF rectF, int i4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        float f4 = i4;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f4;
        rectF2.left *= f4;
        rectF2.right *= f4;
        rectF2.bottom *= f4;
        return rectF2;
    }

    @l3.d
    public static final Rect D(@l3.d RectF rectF) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @l3.d
    public static final RectF E(@l3.d Rect rect) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        return new RectF(rect);
    }

    @l3.d
    public static final Region F(@l3.d Rect rect) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        return new Region(rect);
    }

    @l3.d
    public static final Region G(@l3.d RectF rectF) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @l3.d
    public static final RectF H(@l3.d RectF rectF, @l3.d Matrix m4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(m4, "m");
        m4.mapRect(rectF);
        return rectF;
    }

    @l3.d
    public static final Region I(@l3.d Rect rect, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region = new Region(rect);
        region.op(r4, Region.Op.XOR);
        return region;
    }

    @l3.d
    public static final Region J(@l3.d RectF rectF, @l3.d RectF r4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r4.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @l3.d
    @SuppressLint({"CheckResult"})
    public static final Rect a(@l3.d Rect rect, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Rect rect2 = new Rect(rect);
        rect2.intersect(r4);
        return rect2;
    }

    @l3.d
    @SuppressLint({"CheckResult"})
    public static final RectF b(@l3.d RectF rectF, @l3.d RectF r4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.intersect(r4);
        return rectF2;
    }

    public static final float c(@l3.d RectF rectF) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        return rectF.left;
    }

    public static final int d(@l3.d Rect rect) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        return rect.left;
    }

    public static final float e(@l3.d RectF rectF) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        return rectF.top;
    }

    public static final int f(@l3.d Rect rect) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        return rect.top;
    }

    public static final float g(@l3.d RectF rectF) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        return rectF.right;
    }

    public static final int h(@l3.d Rect rect) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        return rect.right;
    }

    public static final float i(@l3.d RectF rectF) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int j(@l3.d Rect rect) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean k(@l3.d Rect rect, @l3.d Point p4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        return rect.contains(p4.x, p4.y);
    }

    public static final boolean l(@l3.d RectF rectF, @l3.d PointF p4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        return rectF.contains(p4.x, p4.y);
    }

    @l3.d
    public static final Rect m(@l3.d Rect rect, int i4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i5 = -i4;
        rect2.offset(i5, i5);
        return rect2;
    }

    @l3.d
    public static final Rect n(@l3.d Rect rect, @l3.d Point xy) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-xy.x, -xy.y);
        return rect2;
    }

    @l3.d
    public static final RectF o(@l3.d RectF rectF, float f4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f5 = -f4;
        rectF2.offset(f5, f5);
        return rectF2;
    }

    @l3.d
    public static final RectF p(@l3.d RectF rectF, @l3.d PointF xy) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-xy.x, -xy.y);
        return rectF2;
    }

    @l3.d
    public static final Region q(@l3.d Rect rect, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Region region = new Region(rect);
        region.op(r4, Region.Op.DIFFERENCE);
        return region;
    }

    @l3.d
    public static final Region r(@l3.d RectF rectF, @l3.d RectF r4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r4.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @l3.d
    public static final Rect s(@l3.d Rect rect, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r4);
        return rect2;
    }

    @l3.d
    public static final RectF t(@l3.d RectF rectF, @l3.d RectF r4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r4);
        return rectF2;
    }

    @l3.d
    public static final Rect u(@l3.d Rect rect, int i4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i4, i4);
        return rect2;
    }

    @l3.d
    public static final Rect v(@l3.d Rect rect, @l3.d Point xy) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(xy.x, xy.y);
        return rect2;
    }

    @l3.d
    public static final Rect w(@l3.d Rect rect, @l3.d Rect r4) {
        kotlin.jvm.internal.F.p(rect, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r4);
        return rect2;
    }

    @l3.d
    public static final RectF x(@l3.d RectF rectF, float f4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f4, f4);
        return rectF2;
    }

    @l3.d
    public static final RectF y(@l3.d RectF rectF, @l3.d PointF xy) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(xy.x, xy.y);
        return rectF2;
    }

    @l3.d
    public static final RectF z(@l3.d RectF rectF, @l3.d RectF r4) {
        kotlin.jvm.internal.F.p(rectF, "<this>");
        kotlin.jvm.internal.F.p(r4, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r4);
        return rectF2;
    }
}
