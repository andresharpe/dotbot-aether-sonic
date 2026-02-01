package m3;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.junit.runners.g;

/* loaded from: classes2.dex */
public class a extends g {
    public a(Class<?> cls, org.junit.runners.model.g gVar) throws Throwable {
        super(gVar, cls, N(cls.getClasses()));
    }

    private static Class<?>[] N(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class<?> cls : clsArr) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add(cls);
            }
        }
        return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }
}
