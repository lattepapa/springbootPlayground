package com.fast.driller.p3.wrapup1.test1Game;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        //    ****** 초급레벨입니다. ******
        //    캐릭터 액션시작
        //    [패시브]달리기1
        //    [패시브]점프1
        //    [패시브]방향전환1
        //    캐릭터 액션종료

        AdvancedLevel playerA = new AdvancedLevel();
        player.upgradeLevel(playerA);
        player.play(3);
        //    ****** 중급레벨입니다. ******
        //    캐릭터 액션시작
        //    [패시브]달리기2
        //    [패시브]점프2
        //    [패시브]점프2
        //    [패시브]점프2
        //    [패시브]방향전환2
        //    캐릭터 액션종료

        SuperLevel playerS = new SuperLevel();
        player.upgradeLevel(playerS);
        player.play(2);
        //    ****** 고급레벨입니다. ******
        //    캐릭터 액션시작
        //    [패시브]달리기3
        //    [패시브]점프3
        //    [패시브]점프3
        //    [스킬]공격
        //    [패시브]방향전환3
        //    캐릭터 액션종료
    }
}
