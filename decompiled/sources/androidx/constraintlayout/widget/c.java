package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f9668c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9669d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9670e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9671f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9672g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9673h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f9674i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f9675j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f9676k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f9677l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f9678m = -2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f9679n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f9680o = 0;

    /* renamed from: a, reason: collision with root package name */
    ConstraintLayout.b f9681a;

    /* renamed from: b, reason: collision with root package name */
    View f9682b;

    public c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f9681a = (ConstraintLayout.b) layoutParams;
            this.f9682b = view;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    private String K(int i4) {
        switch (i4) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public c A(float f4) {
        this.f9681a.f9504L = f4;
        return this;
    }

    public c B(int i4, int i5) {
        switch (i4) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f9681a).leftMargin = i5;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f9681a).rightMargin = i5;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f9681a).topMargin = i5;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f9681a).bottomMargin = i5;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f9681a.setMarginStart(i5);
                return this;
            case 7:
                this.f9681a.setMarginEnd(i5);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c C(int i4) {
        switch (i4) {
            case 1:
                ConstraintLayout.b bVar = this.f9681a;
                bVar.f9529f = -1;
                bVar.f9527e = -1;
                ((ViewGroup.MarginLayoutParams) bVar).leftMargin = -1;
                bVar.f9563w = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.b bVar2 = this.f9681a;
                bVar2.f9533h = -1;
                bVar2.f9531g = -1;
                ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = -1;
                bVar2.f9566y = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.b bVar3 = this.f9681a;
                bVar3.f9537j = -1;
                bVar3.f9535i = -1;
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = -1;
                bVar3.f9565x = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.b bVar4 = this.f9681a;
                bVar4.f9539k = -1;
                bVar4.f9541l = -1;
                ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = -1;
                bVar4.f9567z = Integer.MIN_VALUE;
                return this;
            case 5:
                this.f9681a.f9543m = -1;
                return this;
            case 6:
                ConstraintLayout.b bVar5 = this.f9681a;
                bVar5.f9555s = -1;
                bVar5.f9557t = -1;
                bVar5.setMarginStart(-1);
                this.f9681a.f9493A = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.b bVar6 = this.f9681a;
                bVar6.f9559u = -1;
                bVar6.f9561v = -1;
                bVar6.setMarginEnd(-1);
                this.f9681a.f9494B = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c D() {
        ConstraintLayout.b bVar = this.f9681a;
        int i4 = bVar.f9529f;
        int i5 = bVar.f9531g;
        if (i4 == -1 && i5 == -1) {
            int i6 = bVar.f9555s;
            int i7 = bVar.f9559u;
            if (i6 != -1 || i7 != -1) {
                c cVar = new c(((ViewGroup) this.f9682b.getParent()).findViewById(i6));
                c cVar2 = new c(((ViewGroup) this.f9682b.getParent()).findViewById(i7));
                ConstraintLayout.b bVar2 = this.f9681a;
                if (i6 != -1 && i7 != -1) {
                    cVar.m(7, i7, 6, 0);
                    cVar2.m(6, i4, 7, 0);
                } else if (i4 != -1 || i7 != -1) {
                    int i8 = bVar2.f9533h;
                    if (i8 != -1) {
                        cVar.m(7, i8, 7, 0);
                    } else {
                        int i9 = bVar2.f9527e;
                        if (i9 != -1) {
                            cVar2.m(6, i9, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            c cVar3 = new c(((ViewGroup) this.f9682b.getParent()).findViewById(i4));
            c cVar4 = new c(((ViewGroup) this.f9682b.getParent()).findViewById(i5));
            ConstraintLayout.b bVar3 = this.f9681a;
            if (i4 != -1 && i5 != -1) {
                cVar3.m(2, i5, 1, 0);
                cVar4.m(1, i4, 2, 0);
            } else if (i4 != -1 || i5 != -1) {
                int i10 = bVar3.f9533h;
                if (i10 != -1) {
                    cVar3.m(2, i10, 2, 0);
                } else {
                    int i11 = bVar3.f9527e;
                    if (i11 != -1) {
                        cVar4.m(1, i11, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public c E() {
        ConstraintLayout.b bVar = this.f9681a;
        int i4 = bVar.f9537j;
        int i5 = bVar.f9539k;
        if (i4 != -1 || i5 != -1) {
            c cVar = new c(((ViewGroup) this.f9682b.getParent()).findViewById(i4));
            c cVar2 = new c(((ViewGroup) this.f9682b.getParent()).findViewById(i5));
            ConstraintLayout.b bVar2 = this.f9681a;
            if (i4 != -1 && i5 != -1) {
                cVar.m(4, i5, 3, 0);
                cVar2.m(3, i4, 4, 0);
            } else if (i4 != -1 || i5 != -1) {
                int i6 = bVar2.f9541l;
                if (i6 != -1) {
                    cVar.m(4, i6, 4, 0);
                } else {
                    int i7 = bVar2.f9535i;
                    if (i7 != -1) {
                        cVar2.m(3, i7, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public c F(float f4) {
        this.f9682b.setRotation(f4);
        return this;
    }

    public c G(float f4) {
        this.f9682b.setRotationX(f4);
        return this;
    }

    public c H(float f4) {
        this.f9682b.setRotationY(f4);
        return this;
    }

    public c I(float f4) {
        this.f9682b.setScaleY(f4);
        return this;
    }

    public c J(float f4) {
        return this;
    }

    public c L(float f4, float f5) {
        this.f9682b.setPivotX(f4);
        this.f9682b.setPivotY(f5);
        return this;
    }

    public c M(float f4) {
        this.f9682b.setPivotX(f4);
        return this;
    }

    public c N(float f4) {
        this.f9682b.setPivotY(f4);
        return this;
    }

    public c O(float f4, float f5) {
        this.f9682b.setTranslationX(f4);
        this.f9682b.setTranslationY(f5);
        return this;
    }

    public c P(float f4) {
        this.f9682b.setTranslationX(f4);
        return this;
    }

    public c Q(float f4) {
        this.f9682b.setTranslationY(f4);
        return this;
    }

    public c R(float f4) {
        this.f9682b.setTranslationZ(f4);
        return this;
    }

    public c S(float f4) {
        this.f9681a.f9500H = f4;
        return this;
    }

    public c T(int i4) {
        this.f9681a.f9507O = i4;
        return this;
    }

    public c U(float f4) {
        this.f9681a.f9505M = f4;
        return this;
    }

    public c V(int i4) {
        this.f9682b.setVisibility(i4);
        return this;
    }

    public c a(int i4, int i5) {
        int i6;
        int i7;
        if (i4 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        m(1, i4, i6, 0);
        if (i5 == 0) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        m(2, i5, i7, 0);
        if (i4 != 0) {
            new c(((ViewGroup) this.f9682b.getParent()).findViewById(i4)).m(2, this.f9682b.getId(), 1, 0);
        }
        if (i5 != 0) {
            new c(((ViewGroup) this.f9682b.getParent()).findViewById(i5)).m(1, this.f9682b.getId(), 2, 0);
        }
        return this;
    }

    public c b(int i4, int i5) {
        int i6;
        int i7;
        if (i4 == 0) {
            i6 = 6;
        } else {
            i6 = 7;
        }
        m(6, i4, i6, 0);
        if (i5 == 0) {
            i7 = 7;
        } else {
            i7 = 6;
        }
        m(7, i5, i7, 0);
        if (i4 != 0) {
            new c(((ViewGroup) this.f9682b.getParent()).findViewById(i4)).m(7, this.f9682b.getId(), 6, 0);
        }
        if (i5 != 0) {
            new c(((ViewGroup) this.f9682b.getParent()).findViewById(i5)).m(6, this.f9682b.getId(), 7, 0);
        }
        return this;
    }

    public c c(int i4, int i5) {
        int i6;
        int i7;
        if (i4 == 0) {
            i6 = 3;
        } else {
            i6 = 4;
        }
        m(3, i4, i6, 0);
        if (i5 == 0) {
            i7 = 4;
        } else {
            i7 = 3;
        }
        m(4, i5, i7, 0);
        if (i4 != 0) {
            new c(((ViewGroup) this.f9682b.getParent()).findViewById(i4)).m(4, this.f9682b.getId(), 3, 0);
        }
        if (i5 != 0) {
            new c(((ViewGroup) this.f9682b.getParent()).findViewById(i5)).m(3, this.f9682b.getId(), 4, 0);
        }
        return this;
    }

    public c d(float f4) {
        this.f9682b.setAlpha(f4);
        return this;
    }

    public void e() {
    }

    public c f(int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        if (i6 >= 0) {
            if (i9 >= 0) {
                if (f4 > 0.0f && f4 <= 1.0f) {
                    if (i5 != 1 && i5 != 2) {
                        if (i5 != 6 && i5 != 7) {
                            m(3, i4, i5, i6);
                            m(4, i7, i8, i9);
                            this.f9681a.f9500H = f4;
                        } else {
                            m(6, i4, i5, i6);
                            m(7, i7, i8, i9);
                            this.f9681a.f9499G = f4;
                        }
                    } else {
                        m(1, i4, i5, i6);
                        m(2, i7, i8, i9);
                        this.f9681a.f9499G = f4;
                    }
                    return this;
                }
                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public c g(int i4) {
        if (i4 == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            f(i4, 2, 0, i4, 1, 0, 0.5f);
        }
        return this;
    }

    public c h(int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        m(1, i4, i5, i6);
        m(2, i7, i8, i9);
        this.f9681a.f9499G = f4;
        return this;
    }

    public c i(int i4) {
        if (i4 == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            f(i4, 7, 0, i4, 6, 0, 0.5f);
        }
        return this;
    }

    public c j(int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        m(6, i4, i5, i6);
        m(7, i7, i8, i9);
        this.f9681a.f9499G = f4;
        return this;
    }

    public c k(int i4) {
        if (i4 == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            f(i4, 4, 0, i4, 3, 0, 0.5f);
        }
        return this;
    }

    public c l(int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        m(3, i4, i5, i6);
        m(4, i7, i8, i9);
        this.f9681a.f9500H = f4;
        return this;
    }

    public c m(int i4, int i5, int i6, int i7) {
        switch (i4) {
            case 1:
                if (i6 == 1) {
                    ConstraintLayout.b bVar = this.f9681a;
                    bVar.f9527e = i5;
                    bVar.f9529f = -1;
                } else if (i6 == 2) {
                    ConstraintLayout.b bVar2 = this.f9681a;
                    bVar2.f9529f = i5;
                    bVar2.f9527e = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + K(i6) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.f9681a).leftMargin = i7;
                return this;
            case 2:
                if (i6 == 1) {
                    ConstraintLayout.b bVar3 = this.f9681a;
                    bVar3.f9531g = i5;
                    bVar3.f9533h = -1;
                } else if (i6 == 2) {
                    ConstraintLayout.b bVar4 = this.f9681a;
                    bVar4.f9533h = i5;
                    bVar4.f9531g = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.f9681a).rightMargin = i7;
                return this;
            case 3:
                if (i6 == 3) {
                    ConstraintLayout.b bVar5 = this.f9681a;
                    bVar5.f9535i = i5;
                    bVar5.f9537j = -1;
                    bVar5.f9543m = -1;
                    bVar5.f9545n = -1;
                    bVar5.f9547o = -1;
                } else if (i6 == 4) {
                    ConstraintLayout.b bVar6 = this.f9681a;
                    bVar6.f9537j = i5;
                    bVar6.f9535i = -1;
                    bVar6.f9543m = -1;
                    bVar6.f9545n = -1;
                    bVar6.f9547o = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.f9681a).topMargin = i7;
                return this;
            case 4:
                if (i6 == 4) {
                    ConstraintLayout.b bVar7 = this.f9681a;
                    bVar7.f9541l = i5;
                    bVar7.f9539k = -1;
                    bVar7.f9543m = -1;
                    bVar7.f9545n = -1;
                    bVar7.f9547o = -1;
                } else if (i6 == 3) {
                    ConstraintLayout.b bVar8 = this.f9681a;
                    bVar8.f9539k = i5;
                    bVar8.f9541l = -1;
                    bVar8.f9543m = -1;
                    bVar8.f9545n = -1;
                    bVar8.f9547o = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.f9681a).bottomMargin = i7;
                return this;
            case 5:
                if (i6 == 5) {
                    ConstraintLayout.b bVar9 = this.f9681a;
                    bVar9.f9543m = i5;
                    bVar9.f9541l = -1;
                    bVar9.f9539k = -1;
                    bVar9.f9535i = -1;
                    bVar9.f9537j = -1;
                } else if (i6 == 3) {
                    ConstraintLayout.b bVar10 = this.f9681a;
                    bVar10.f9545n = i5;
                    bVar10.f9541l = -1;
                    bVar10.f9539k = -1;
                    bVar10.f9535i = -1;
                    bVar10.f9537j = -1;
                } else if (i6 == 4) {
                    ConstraintLayout.b bVar11 = this.f9681a;
                    bVar11.f9547o = i5;
                    bVar11.f9541l = -1;
                    bVar11.f9539k = -1;
                    bVar11.f9535i = -1;
                    bVar11.f9537j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                }
                this.f9681a.f9496D = i7;
                return this;
            case 6:
                if (i6 == 6) {
                    ConstraintLayout.b bVar12 = this.f9681a;
                    bVar12.f9557t = i5;
                    bVar12.f9555s = -1;
                } else if (i6 == 7) {
                    ConstraintLayout.b bVar13 = this.f9681a;
                    bVar13.f9555s = i5;
                    bVar13.f9557t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                }
                this.f9681a.setMarginStart(i7);
                return this;
            case 7:
                if (i6 == 7) {
                    ConstraintLayout.b bVar14 = this.f9681a;
                    bVar14.f9561v = i5;
                    bVar14.f9559u = -1;
                } else if (i6 == 6) {
                    ConstraintLayout.b bVar15 = this.f9681a;
                    bVar15.f9559u = i5;
                    bVar15.f9561v = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i6) + " undefined");
                }
                this.f9681a.setMarginEnd(i7);
                return this;
            default:
                throw new IllegalArgumentException(K(i4) + " to " + K(i6) + " unknown");
        }
    }

    public c n(int i4) {
        this.f9681a.f9509Q = i4;
        return this;
    }

    public c o(int i4) {
        this.f9681a.f9508P = i4;
        return this;
    }

    public c p(int i4) {
        ((ViewGroup.MarginLayoutParams) this.f9681a).height = i4;
        return this;
    }

    public c q(int i4) {
        this.f9681a.f9513U = i4;
        return this;
    }

    public c r(int i4) {
        this.f9681a.f9512T = i4;
        return this;
    }

    public c s(int i4) {
        this.f9681a.f9511S = i4;
        return this;
    }

    public c t(int i4) {
        this.f9681a.f9510R = i4;
        return this;
    }

    public c u(int i4) {
        ((ViewGroup.MarginLayoutParams) this.f9681a).width = i4;
        return this;
    }

    public c v(String str) {
        this.f9681a.f9501I = str;
        return this;
    }

    public c w(float f4) {
        this.f9682b.setElevation(f4);
        return this;
    }

    public c x(int i4, int i5) {
        switch (i4) {
            case 1:
                this.f9681a.f9563w = i5;
                return this;
            case 2:
                this.f9681a.f9566y = i5;
                return this;
            case 3:
                this.f9681a.f9565x = i5;
                return this;
            case 4:
                this.f9681a.f9567z = i5;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f9681a.f9493A = i5;
                return this;
            case 7:
                this.f9681a.f9494B = i5;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c y(float f4) {
        this.f9681a.f9499G = f4;
        return this;
    }

    public c z(int i4) {
        this.f9681a.f9506N = i4;
        return this;
    }
}
