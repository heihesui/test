package priorityqueue;

import java.util.PriorityQueue;

public class SeatManager {
    PriorityQueue<Integer> queue;

    public SeatManager(int n) {
        queue = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
    }

    public int reserve() {
        return queue.poll();
    }

    public void unreserve(int seatNumber) {
        queue.add(seatNumber);
    }
}
/*
public class SeatManager {
    // 48 38 564 100.7;
    // [key,value] 是已预约区间
    SortedDictionary<int,int> dic;
    // int n;
    int minSeat = 1;
    public SeatManager(int n) {
        // this.n = n;
        dic = new SortedDictionary<int,int>();
    }

    public int Reserve() {
        int ret = minSeat;
        var pre = new KeyValuePair<int,int>(0, 0);
        foreach(var kvp in dic){
            if(kvp.Value < ret){
                pre = kvp;
            }else{
                break;
            }
        }
        // 更新minSeat给下次使用
        if(pre.Key == 0){
            if(dic.ContainsKey(ret+1)){
                // 合并到高区间
                dic.Add(ret, dic[ret+1]);
                dic.Remove(ret+1);
                minSeat = dic[ret] + 1;
            }else{
                dic.Add(ret, ret);  // 单独开个区间
                minSeat = ret + 1;
            }
        }else{
            if(pre.Value + 1 == ret){   // 肯定成立？
                // 合并到低区间
                dic[pre.Key] = ret;
                if(dic.ContainsKey(ret+1)){
                    // 继续合并高区间
                    dic[pre.Key] = dic[ret+1];
                    dic.Remove(ret+1);
                }
                minSeat = dic[pre.Key] + 1;
            }
        }
        return ret;
    }

    public void Unreserve(int seatNumber) {
        var target = new KeyValuePair<int,int>(0, 0);
        foreach(var kvp in dic){
            if(kvp.Key <= seatNumber && seatNumber <= kvp.Value){
                target = kvp;
                break;
            }
        }
        minSeat = Math.Min(minSeat, seatNumber);
        if(target.Key == target.Value){
            dic.Remove(target.Key);
            return;
        }
        if(target.Key == seatNumber){
            dic.Add(seatNumber+1, target.Value);
            dic.Remove(target.Key);
            return;
        }
        if(target.Value == seatNumber){
            dic[target.Key] = seatNumber - 1;
            return;
        }
        // 区间分裂
        dic.Add(seatNumber+1, target.Value);
        dic[target.Key] = seatNumber - 1;
    }
}*/
