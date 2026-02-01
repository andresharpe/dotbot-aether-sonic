package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0955a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    final a f18356a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(C0955a.b bVar);

        C0955a.b b(int i4, int i5, int i6, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(a aVar) {
        this.f18356a = aVar;
    }

    private int a(List<C0955a.b> list) {
        boolean z3 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f17948a == 8) {
                if (z3) {
                    return size;
                }
            } else {
                z3 = true;
            }
        }
        return -1;
    }

    private void c(List<C0955a.b> list, int i4, C0955a.b bVar, int i5, C0955a.b bVar2) {
        int i6;
        int i7 = bVar.f17951d;
        int i8 = bVar2.f17949b;
        if (i7 < i8) {
            i6 = -1;
        } else {
            i6 = 0;
        }
        int i9 = bVar.f17949b;
        if (i9 < i8) {
            i6++;
        }
        if (i8 <= i9) {
            bVar.f17949b = i9 + bVar2.f17951d;
        }
        int i10 = bVar2.f17949b;
        if (i10 <= i7) {
            bVar.f17951d = i7 + bVar2.f17951d;
        }
        bVar2.f17949b = i10 + i6;
        list.set(i4, bVar2);
        list.set(i5, bVar);
    }

    private void d(List<C0955a.b> list, int i4, int i5) {
        C0955a.b bVar = list.get(i4);
        C0955a.b bVar2 = list.get(i5);
        int i6 = bVar2.f17948a;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 4) {
                    f(list, i4, bVar, i5, bVar2);
                    return;
                }
                return;
            }
            e(list, i4, bVar, i5, bVar2);
            return;
        }
        c(list, i4, bVar, i5, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(List<C0955a.b> list) {
        while (true) {
            int a4 = a(list);
            if (a4 != -1) {
                d(list, a4, a4 + 1);
            } else {
                return;
            }
        }
    }

    void e(List<C0955a.b> list, int i4, C0955a.b bVar, int i5, C0955a.b bVar2) {
        boolean z3;
        int i6 = bVar.f17949b;
        int i7 = bVar.f17951d;
        boolean z4 = false;
        if (i6 < i7) {
            if (bVar2.f17949b == i6 && bVar2.f17951d == i7 - i6) {
                z3 = false;
                z4 = true;
            } else {
                z3 = false;
            }
        } else if (bVar2.f17949b == i7 + 1 && bVar2.f17951d == i6 - i7) {
            z3 = true;
            z4 = true;
        } else {
            z3 = true;
        }
        int i8 = bVar2.f17949b;
        if (i7 < i8) {
            bVar2.f17949b = i8 - 1;
        } else {
            int i9 = bVar2.f17951d;
            if (i7 < i8 + i9) {
                bVar2.f17951d = i9 - 1;
                bVar.f17948a = 2;
                bVar.f17951d = 1;
                if (bVar2.f17951d == 0) {
                    list.remove(i5);
                    this.f18356a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f17949b;
        int i11 = bVar2.f17949b;
        C0955a.b bVar3 = null;
        if (i10 <= i11) {
            bVar2.f17949b = i11 + 1;
        } else {
            int i12 = bVar2.f17951d;
            if (i10 < i11 + i12) {
                bVar3 = this.f18356a.b(2, i10 + 1, (i11 + i12) - i10, null);
                bVar2.f17951d = bVar.f17949b - bVar2.f17949b;
            }
        }
        if (z4) {
            list.set(i4, bVar2);
            list.remove(i5);
            this.f18356a.a(bVar);
            return;
        }
        if (z3) {
            if (bVar3 != null) {
                int i13 = bVar.f17949b;
                if (i13 > bVar3.f17949b) {
                    bVar.f17949b = i13 - bVar3.f17951d;
                }
                int i14 = bVar.f17951d;
                if (i14 > bVar3.f17949b) {
                    bVar.f17951d = i14 - bVar3.f17951d;
                }
            }
            int i15 = bVar.f17949b;
            if (i15 > bVar2.f17949b) {
                bVar.f17949b = i15 - bVar2.f17951d;
            }
            int i16 = bVar.f17951d;
            if (i16 > bVar2.f17949b) {
                bVar.f17951d = i16 - bVar2.f17951d;
            }
        } else {
            if (bVar3 != null) {
                int i17 = bVar.f17949b;
                if (i17 >= bVar3.f17949b) {
                    bVar.f17949b = i17 - bVar3.f17951d;
                }
                int i18 = bVar.f17951d;
                if (i18 >= bVar3.f17949b) {
                    bVar.f17951d = i18 - bVar3.f17951d;
                }
            }
            int i19 = bVar.f17949b;
            if (i19 >= bVar2.f17949b) {
                bVar.f17949b = i19 - bVar2.f17951d;
            }
            int i20 = bVar.f17951d;
            if (i20 >= bVar2.f17949b) {
                bVar.f17951d = i20 - bVar2.f17951d;
            }
        }
        list.set(i4, bVar2);
        if (bVar.f17949b != bVar.f17951d) {
            list.set(i5, bVar);
        } else {
            list.remove(i5);
        }
        if (bVar3 != null) {
            list.add(i4, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(java.util.List<androidx.recyclerview.widget.C0955a.b> r9, int r10, androidx.recyclerview.widget.C0955a.b r11, int r12, androidx.recyclerview.widget.C0955a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f17951d
            int r1 = r13.f17949b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f17949b = r1
            goto L20
        Ld:
            int r5 = r13.f17951d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f17951d = r5
            androidx.recyclerview.widget.x$a r0 = r8.f18356a
            int r1 = r11.f17949b
            java.lang.Object r5 = r13.f17950c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f17949b
            int r5 = r13.f17949b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f17949b = r5
            goto L41
        L2b:
            int r6 = r13.f17951d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.x$a r4 = r8.f18356a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f17950c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f17951d
            int r1 = r1 - r5
            r13.f17951d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f17951d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.x$a r11 = r8.f18356a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.x.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
