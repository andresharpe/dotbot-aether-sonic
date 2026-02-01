package C0;

import android.util.SparseArray;
import androidx.annotation.N;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<Priority> f31a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<Priority, Integer> f32b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f32b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f32b.put(Priority.VERY_LOW, 1);
        f32b.put(Priority.HIGHEST, 2);
        for (Priority priority : f32b.keySet()) {
            f31a.append(f32b.get(priority).intValue(), priority);
        }
    }

    public static int a(@N Priority priority) {
        Integer num = f32b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @N
    public static Priority b(int i4) {
        Priority priority = f31a.get(i4);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i4);
    }
}
