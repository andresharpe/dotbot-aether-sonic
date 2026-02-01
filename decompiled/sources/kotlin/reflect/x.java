package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.collections.C2109w;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.r
@U({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
/* loaded from: classes2.dex */
public final class x implements TypeVariable<GenericDeclaration>, v {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final s f52517E;

    public x(@l3.d s typeParameter) {
        F.p(typeParameter, "typeParameter");
        this.f52517E = typeParameter;
    }

    @l3.e
    public final <T extends Annotation> T a(@l3.d Class<T> annotationClass) {
        F.p(annotationClass, "annotationClass");
        return null;
    }

    @l3.d
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @l3.d
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (F.g(getName(), typeVariable.getName()) && F.g(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @l3.d
    public Type[] getBounds() {
        int b02;
        Type c4;
        List<r> upperBounds = this.f52517E.getUpperBounds();
        b02 = C2109w.b0(upperBounds, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            c4 = y.c((r) it.next(), true);
            arrayList.add(c4);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @l3.d
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f52517E));
    }

    @Override // java.lang.reflect.TypeVariable
    @l3.d
    public String getName() {
        return this.f52517E.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @l3.d
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @l3.d
    public String toString() {
        return getTypeName();
    }
}
