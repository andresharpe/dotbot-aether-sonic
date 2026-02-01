package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class N {
    public static final float a(@l3.d PointF pointF) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        return pointF.x;
    }

    public static final int b(@l3.d Point point) {
        kotlin.jvm.internal.F.p(point, "<this>");
        return point.x;
    }

    public static final float c(@l3.d PointF pointF) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        return pointF.y;
    }

    public static final int d(@l3.d Point point) {
        kotlin.jvm.internal.F.p(point, "<this>");
        return point.y;
    }

    @l3.d
    public static final Point e(@l3.d Point point, int i4) {
        kotlin.jvm.internal.F.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i5 = -i4;
        point2.offset(i5, i5);
        return point2;
    }

    @l3.d
    public static final Point f(@l3.d Point point, @l3.d Point p4) {
        kotlin.jvm.internal.F.p(point, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(-p4.x, -p4.y);
        return point2;
    }

    @l3.d
    public static final PointF g(@l3.d PointF pointF, float f4) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f5 = -f4;
        pointF2.offset(f5, f5);
        return pointF2;
    }

    @l3.d
    public static final PointF h(@l3.d PointF pointF, @l3.d PointF p4) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(-p4.x, -p4.y);
        return pointF2;
    }

    @l3.d
    public static final Point i(@l3.d Point point, int i4) {
        kotlin.jvm.internal.F.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i4, i4);
        return point2;
    }

    @l3.d
    public static final Point j(@l3.d Point point, @l3.d Point p4) {
        kotlin.jvm.internal.F.p(point, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(p4.x, p4.y);
        return point2;
    }

    @l3.d
    public static final PointF k(@l3.d PointF pointF, float f4) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f4, f4);
        return pointF2;
    }

    @l3.d
    public static final PointF l(@l3.d PointF pointF, @l3.d PointF p4) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        kotlin.jvm.internal.F.p(p4, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(p4.x, p4.y);
        return pointF2;
    }

    @l3.d
    public static final Point m(@l3.d PointF pointF) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @l3.d
    public static final PointF n(@l3.d Point point) {
        kotlin.jvm.internal.F.p(point, "<this>");
        return new PointF(point);
    }

    @l3.d
    public static final Point o(@l3.d Point point) {
        kotlin.jvm.internal.F.p(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @l3.d
    public static final PointF p(@l3.d PointF pointF) {
        kotlin.jvm.internal.F.p(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}
