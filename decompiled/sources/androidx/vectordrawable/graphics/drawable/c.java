package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.core.content.res.n;
import androidx.vectordrawable.graphics.drawable.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c extends h implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: M, reason: collision with root package name */
    private static final String f20276M = "AnimatedVDCompat";

    /* renamed from: N, reason: collision with root package name */
    private static final String f20277N = "animated-vector";

    /* renamed from: O, reason: collision with root package name */
    private static final String f20278O = "target";

    /* renamed from: P, reason: collision with root package name */
    private static final boolean f20279P = false;

    /* renamed from: F, reason: collision with root package name */
    private C0183c f20280F;

    /* renamed from: G, reason: collision with root package name */
    private Context f20281G;

    /* renamed from: H, reason: collision with root package name */
    private ArgbEvaluator f20282H;

    /* renamed from: I, reason: collision with root package name */
    d f20283I;

    /* renamed from: J, reason: collision with root package name */
    private Animator.AnimatorListener f20284J;

    /* renamed from: K, reason: collision with root package name */
    ArrayList<b.a> f20285K;

    /* renamed from: L, reason: collision with root package name */
    final Drawable.Callback f20286L;

    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            c.this.scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f20285K);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b.a) arrayList.get(i4)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f20285K);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((b.a) arrayList.get(i4)).c(c.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0183c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f20289a;

        /* renamed from: b, reason: collision with root package name */
        i f20290b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f20291c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f20292d;

        /* renamed from: e, reason: collision with root package name */
        androidx.collection.a<Animator, String> f20293e;

        public C0183c(Context context, C0183c c0183c, Drawable.Callback callback, Resources resources) {
            if (c0183c != null) {
                this.f20289a = c0183c.f20289a;
                i iVar = c0183c.f20290b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f20290b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f20290b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f20290b.mutate();
                    this.f20290b = iVar2;
                    iVar2.setCallback(callback);
                    this.f20290b.setBounds(c0183c.f20290b.getBounds());
                    this.f20290b.m(false);
                }
                ArrayList<Animator> arrayList = c0183c.f20292d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f20292d = new ArrayList<>(size);
                    this.f20293e = new androidx.collection.a<>(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        Animator animator = c0183c.f20292d.get(i4);
                        Animator clone = animator.clone();
                        String str = c0183c.f20293e.get(animator);
                        clone.setTarget(this.f20290b.h(str));
                        this.f20292d.add(clone);
                        this.f20293e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f20291c == null) {
                this.f20291c = new AnimatorSet();
            }
            this.f20291c.playTogether(this.f20292d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f20289a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static void a(Drawable drawable) {
        if (!(drawable instanceof Animatable)) {
            return;
        }
        ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
    }

    @P
    public static c e(@N Context context, @InterfaceC0578v int i4) {
        c cVar = new c(context);
        Drawable g4 = androidx.core.content.res.i.g(context.getResources(), i4, context.getTheme());
        cVar.f20311E = g4;
        g4.setCallback(cVar.f20286L);
        cVar.f20283I = new d(cVar.f20311E.getConstantState());
        return cVar;
    }

    public static c f(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void g(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        h((AnimatedVectorDrawable) drawable, aVar);
    }

    @W(23)
    private static void h(@N AnimatedVectorDrawable animatedVectorDrawable, @N b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    private void i() {
        Animator.AnimatorListener animatorListener = this.f20284J;
        if (animatorListener != null) {
            this.f20280F.f20291c.removeListener(animatorListener);
            this.f20284J = null;
        }
    }

    private void j(String str, Animator animator) {
        animator.setTarget(this.f20280F.f20290b.h(str));
        C0183c c0183c = this.f20280F;
        if (c0183c.f20292d == null) {
            c0183c.f20292d = new ArrayList<>();
            this.f20280F.f20293e = new androidx.collection.a<>();
        }
        this.f20280F.f20292d.add(animator);
        this.f20280F.f20293e.put(animator, str);
    }

    private void k(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i4 = 0; i4 < childAnimations.size(); i4++) {
                k(childAnimations.get(i4));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f20282H == null) {
                    this.f20282H = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f20282H);
            }
        }
    }

    public static boolean l(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return m((AnimatedVectorDrawable) drawable, aVar);
    }

    @W(23)
    private static boolean m(AnimatedVectorDrawable animatedVectorDrawable, b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.a(drawable, theme);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void b(@N b.a aVar) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f20285K == null) {
            this.f20285K = new ArrayList<>();
        }
        if (this.f20285K.contains(aVar)) {
            return;
        }
        this.f20285K.add(aVar);
        if (this.f20284J == null) {
            this.f20284J = new b();
        }
        this.f20280F.f20291c.addListener(this.f20284J);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        i();
        ArrayList<b.a> arrayList = this.f20285K;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean d(@N b.a aVar) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            m((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<b.a> arrayList = this.f20285K;
        if (arrayList != null && aVar != null) {
            boolean remove = arrayList.remove(aVar);
            if (this.f20285K.size() == 0) {
                i();
            }
            return remove;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f20280F.f20290b.draw(canvas);
        if (this.f20280F.f20291c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.d(drawable);
        }
        return this.f20280F.f20290b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f20280F.f20289a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.e(drawable);
        }
        return this.f20280F.f20290b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f20311E != null) {
            return new d(this.f20311E.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f20280F.f20290b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f20280F.f20290b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f20280F.f20290b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f20277N.equals(name)) {
                    TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20208M);
                    int resourceId = s4.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i e4 = i.e(resources, resourceId, theme);
                        e4.m(false);
                        e4.setCallback(this.f20286L);
                        i iVar = this.f20280F.f20290b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f20280F.f20290b = e4;
                    }
                    s4.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f20210O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f20281G;
                        if (context != null) {
                            j(string, e.j(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f20280F.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.h(drawable);
        }
        return this.f20280F.f20290b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f20280F.f20291c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f20280F.f20290b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f20280F.f20290b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        return this.f20280F.f20290b.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f20280F.f20290b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.f20280F.f20290b.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.j(drawable, z3);
        } else {
            this.f20280F.f20290b.setAutoMirrored(z3);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i4);
        } else {
            this.f20280F.f20290b.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
        } else {
            this.f20280F.f20290b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
        } else {
            this.f20280F.f20290b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f20280F.f20290b.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f20280F.f20291c.isStarted()) {
                return;
            }
            this.f20280F.f20291c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f20280F.f20291c.end();
        }
    }

    private c(@P Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f20280F.f20290b.setColorFilter(colorFilter);
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f20294a;

        public d(Drawable.ConstantState constantState) {
            this.f20294a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f20294a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f20294a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f20294a.newDrawable();
            cVar.f20311E = newDrawable;
            newDrawable.setCallback(cVar.f20286L);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f20294a.newDrawable(resources);
            cVar.f20311E = newDrawable;
            newDrawable.setCallback(cVar.f20286L);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f20294a.newDrawable(resources, theme);
            cVar.f20311E = newDrawable;
            newDrawable.setCallback(cVar.f20286L);
            return cVar;
        }
    }

    private c(@P Context context, @P C0183c c0183c, @P Resources resources) {
        this.f20282H = null;
        this.f20284J = null;
        this.f20285K = null;
        a aVar = new a();
        this.f20286L = aVar;
        this.f20281G = context;
        if (c0183c != null) {
            this.f20280F = c0183c;
        } else {
            this.f20280F = new C0183c(context, c0183c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
