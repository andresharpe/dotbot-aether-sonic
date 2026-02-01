package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private final View f13064a;

    /* renamed from: b, reason: collision with root package name */
    private final a f13065b;

    /* renamed from: c, reason: collision with root package name */
    private int f13066c;

    /* renamed from: d, reason: collision with root package name */
    private int f13067d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13068e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnLongClickListener f13069f = new View.OnLongClickListener() { // from class: androidx.core.view.y
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return A.this.d(view);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private final View.OnTouchListener f13070g = new View.OnTouchListener() { // from class: androidx.core.view.z
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return A.this.e(view, motionEvent);
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        boolean a(@androidx.annotation.N View view, @androidx.annotation.N A a4);
    }

    public A(@androidx.annotation.N View view, @androidx.annotation.N a aVar) {
        this.f13064a = view;
        this.f13065b = aVar;
    }

    public void a() {
        this.f13064a.setOnLongClickListener(this.f13069f);
        this.f13064a.setOnTouchListener(this.f13070g);
    }

    public void b() {
        this.f13064a.setOnLongClickListener(null);
        this.f13064a.setOnTouchListener(null);
    }

    public void c(@androidx.annotation.N Point point) {
        point.set(this.f13066c, this.f13067d);
    }

    public boolean d(@androidx.annotation.N View view) {
        return this.f13065b.a(view, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(@androidx.annotation.N android.view.View r7, @androidx.annotation.N android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.Q.l(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f13068e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f13066c
            if (r8 != r0) goto L39
            int r8 = r6.f13067d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f13066c = r0
            r6.f13067d = r1
            androidx.core.view.A$a r8 = r6.f13065b
            boolean r7 = r8.a(r7, r6)
            r6.f13068e = r7
            return r7
        L46:
            r6.f13068e = r3
            goto L4d
        L49:
            r6.f13066c = r0
            r6.f13067d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.A.e(android.view.View, android.view.MotionEvent):boolean");
    }
}
