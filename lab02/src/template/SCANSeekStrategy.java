package template;

public class SCANSeekStrategy implements SeekStrategy{
    private String name = "SCAN";
    // start로 부터 왼쪽으로 가기로 했다.
    // queue의 min 까지 가면, start의 다음으로 넘어가서 max까지
    // 1. sort한다. 2. start ~ min 까지 head 이동 3. start.next ~ max까지 head 이동되면 종료
    @Override
    public void seek(int[] queue, int start){
        
    }

    @Override
    public String getName(){
        return name;
    }
}
