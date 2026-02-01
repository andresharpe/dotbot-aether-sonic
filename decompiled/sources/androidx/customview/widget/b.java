package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
class b {

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t3, Rect rect);
    }

    /* renamed from: androidx.customview.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0116b<T, V> {
        V a(T t3, int i4);

        int b(T t3);
    }

    /* loaded from: classes.dex */
    private static class c<T> implements Comparator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f13885a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f13886b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        private final boolean f13887c;

        /* renamed from: d, reason: collision with root package name */
        private final a<T> f13888d;

        c(boolean z3, a<T> aVar) {
            this.f13887c = z3;
            this.f13888d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t3, T t4) {
            Rect rect = this.f13885a;
            Rect rect2 = this.f13886b;
            this.f13888d.a(t3, rect);
            this.f13888d.a(t4, rect2);
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 < i5) {
                return -1;
            }
            if (i4 > i5) {
                return 1;
            }
            int i6 = rect.left;
            int i7 = rect2.left;
            if (i6 < i7) {
                if (!this.f13887c) {
                    return -1;
                }
                return 1;
            }
            if (i6 > i7) {
                if (this.f13887c) {
                    return -1;
                }
                return 1;
            }
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 < i11) {
                if (!this.f13887c) {
                    return -1;
                }
                return 1;
            }
            if (i10 > i11) {
                if (this.f13887c) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    private b() {
    }

    private static boolean a(int i4, @N Rect rect, @N Rect rect2, @N Rect rect3) {
        boolean b4 = b(i4, rect, rect2);
        if (b(i4, rect, rect3) || !b4) {
            return false;
        }
        if (j(i4, rect, rect3) && i4 != 17 && i4 != 66 && k(i4, rect, rect2) >= m(i4, rect, rect3)) {
            return false;
        }
        return true;
    }

    private static boolean b(int i4, @N Rect rect, @N Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static <L, T> T c(@N L l4, @N InterfaceC0116b<L, T> interfaceC0116b, @N a<T> aVar, @P T t3, @N Rect rect, int i4) {
        Rect rect2 = new Rect(rect);
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int b4 = interfaceC0116b.b(l4);
        Rect rect3 = new Rect();
        T t4 = null;
        for (int i5 = 0; i5 < b4; i5++) {
            T a4 = interfaceC0116b.a(l4, i5);
            if (a4 != t3) {
                aVar.a(a4, rect3);
                if (h(i4, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t4 = a4;
                }
            }
        }
        return t4;
    }

    public static <L, T> T d(@N L l4, @N InterfaceC0116b<L, T> interfaceC0116b, @N a<T> aVar, @P T t3, int i4, boolean z3, boolean z4) {
        int b4 = interfaceC0116b.b(l4);
        ArrayList arrayList = new ArrayList(b4);
        for (int i5 = 0; i5 < b4; i5++) {
            arrayList.add(interfaceC0116b.a(l4, i5));
        }
        Collections.sort(arrayList, new c(z3, aVar));
        if (i4 != 1) {
            if (i4 == 2) {
                return (T) e(t3, arrayList, z4);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) f(t3, arrayList, z4);
    }

    private static <T> T e(T t3, ArrayList<T> arrayList, boolean z3) {
        int lastIndexOf;
        int size = arrayList.size();
        if (t3 == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(t3);
        }
        int i4 = lastIndexOf + 1;
        if (i4 < size) {
            return arrayList.get(i4);
        }
        if (z3 && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    private static <T> T f(T t3, ArrayList<T> arrayList, boolean z3) {
        int indexOf;
        int size = arrayList.size();
        if (t3 == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(t3);
        }
        int i4 = indexOf - 1;
        if (i4 >= 0) {
            return arrayList.get(i4);
        }
        if (z3 && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    private static int g(int i4, int i5) {
        return (i4 * 13 * i4) + (i5 * i5);
    }

    private static boolean h(int i4, @N Rect rect, @N Rect rect2, @N Rect rect3) {
        if (!i(rect, rect2, i4)) {
            return false;
        }
        if (!i(rect, rect3, i4) || a(i4, rect, rect2, rect3)) {
            return true;
        }
        if (a(i4, rect, rect3, rect2) || g(k(i4, rect, rect2), o(i4, rect, rect2)) >= g(k(i4, rect, rect3), o(i4, rect, rect3))) {
            return false;
        }
        return true;
    }

    private static boolean i(@N Rect rect, @N Rect rect2, int i4) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        int i5 = rect.top;
                        int i6 = rect2.top;
                        if ((i5 >= i6 && rect.bottom > i6) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i7 = rect.left;
                int i8 = rect2.left;
                if ((i7 >= i8 && rect.right > i8) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            if ((i9 <= i10 && rect.top < i10) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i11 = rect.right;
        int i12 = rect2.right;
        if ((i11 <= i12 && rect.left < i12) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    private static boolean j(int i4, @N Rect rect, @N Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        if (rect.bottom > rect2.top) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                if (rect.right > rect2.left) {
                    return false;
                }
                return true;
            }
            if (rect.top < rect2.bottom) {
                return false;
            }
            return true;
        }
        if (rect.left < rect2.right) {
            return false;
        }
        return true;
    }

    private static int k(int i4, @N Rect rect, @N Rect rect2) {
        return Math.max(0, l(i4, rect, rect2));
    }

    private static int l(int i4, @N Rect rect, @N Rect rect2) {
        int i5;
        int i6;
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        i5 = rect2.top;
                        i6 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i5 = rect2.left;
                    i6 = rect.right;
                }
            } else {
                i5 = rect.top;
                i6 = rect2.bottom;
            }
        } else {
            i5 = rect.left;
            i6 = rect2.right;
        }
        return i5 - i6;
    }

    private static int m(int i4, @N Rect rect, @N Rect rect2) {
        return Math.max(1, n(i4, rect, rect2));
    }

    private static int n(int i4, @N Rect rect, @N Rect rect2) {
        int i5;
        int i6;
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 == 130) {
                        i5 = rect2.bottom;
                        i6 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i5 = rect2.right;
                    i6 = rect.right;
                }
            } else {
                i5 = rect.top;
                i6 = rect2.top;
            }
        } else {
            i5 = rect.left;
            i6 = rect2.left;
        }
        return i5 - i6;
    }

    private static int o(int i4, @N Rect rect, @N Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
