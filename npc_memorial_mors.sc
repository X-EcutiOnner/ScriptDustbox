@spawn(type: BL_MOB, ID: 40236, speed: 200, option: 0, view: 2998, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����N??")
@nomalattack(src: "2998:�����N??:0qj1@rev.gat"(40236), dst: , damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(), dst: 40236, damage: 64, sDelay: 260, dDelay: 440, tick: 432013023)

moro_cav.gat,61,69,3	script	��C�ǐՑ���#a1	730,{/* 65381 */
	if(checkquest(201725)) {
		mes "[��C�ǐՑ���]";
		mes "������x�߂��ė���Ǝv���܂����B";
		next;
		mes "[��C�ǐՑ���]";
		mes "�����N�𑊎肷��ׂɂ�";
		mes "1�l�ł͂ƂĂ��댯�Ȃ̂�";
		mes "�p�[�e�B�[���Ɨ͂����킹�ĉ������B";
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "�����A�Ԃ��Ԃɒʂ��铹�𗘗p����Ȃ�";
			mes "�p�[�e�B�[���[�_�[�̕���";
			mes "���ɘb��������悤�A�`���Ă��������B";
			close;
		}
		mes "����ł�";
		mes "�Ԃ��Ԃɓ����Ă݂܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[��C�ǐՑ���]";
			mes "�C���ς������";
			mes "�܂��K�˂ė��ĉ������I";
			close;
		}
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[��C�ǐՑ���]";
			mes "�܂��Ԃ��Ԃ֑�������";
			mes "�J���Ă��܂���B";
			mes "�����҂��ĉ������B";
			close;
		}
		mdcreate "mors";
		mes "[��C�ǐՑ���]";
		mes "�����A�Ԃ��Ԃ�";
		mes "�ʂ��铹���J���܂����B";
		mes "���̓����J���鎞�Ԃ�";
		mes "��������Ă���̂�";
		mes "���������ĉ������B";
		close;
	}
	mes "[��C�ǐՑ���]";
	mes "�����̓����N������h���A���R��";
	mes "�őO���ł��B";
	mes "���̓����N�̑��Ղ�ǂ��Ă��܂��B";
	next;
	if(checkquest(201720) == 0) {	// �r�I�X�̓����U��
		mes "[��C�ǐՑ���]";
		mes "���݁A���̐Ԃ��Ԃ𒲍����ł��B";
		mes "�ǂ������ׂ̗ɂ���A";
		mes "���F����Ɛ[���֌W��";
		mes "���肻���Ȃ̂ł����c�c�B";
		next;
		mes "�]^ff0000���F����^000000���ɒ������悤�]";
		close;
	}
	mes "[��C�ǐՑ���]";
	mes "����܂ł̓w�͂�����A";
	mes "���Ƀ����N�̐�����Ƃ���";
	mes "�L�͂ȏꏊ�𔭌����܂����B";
	next;
	mes "[��C�ǐՑ���]";
	mes "���ꂪ����^ff0000�Ԃ���^000000�ł��B";
	next;
	mes "[��C�ǐՑ���]";
	mes "�����A�ǐՂ���Ƃ��鎄�̗͂ł�";
	mes "��������ւ̐N����";
	mes "�댯�ł���Ɣ��f���܂����B";
	next;
	mes "[��C�ǐՑ���]";
	mes "���Ȃ���������K�ꂽ�Ƃ�������";
	mes "�����ړI�����������͎҂ł��傤�H";
	next;
	mes "[��C�ǐՑ���]";
	mes "�ǂ��ł��傤�B";
	mes "����֐N�����ă����N�ǐՂ�";
	mes "��w��؂��Ă���܂��񂩁H";
	next;
	mes "[��C�ǐՑ���]";
	mes "�A���A����Ă���Ƃ͂���";
	mes "����̓����N�ł��B";
	mes "1�l�ł͊댯�Ȃ̂�";
	mes "�K��^ff0000�p�[�e�B�[��g���^000000";
	mes "����ł��������B";
	next;
	mes "[��C�ǐՑ���]";
	mes "�Ԃ��Ԃ֒ʂ��铹�͎����J���Ă��܂��B";
	mes "�����A��ɐi�ނ悤�ł�����";
	mes "�p�[�e�B�[���[�_�[�̕���";
	mes "���ɘb��������悤�A�`���Ă��������B";
	close;
OnInit:
	waitingroom "�����X�̓��A����",0; //65381
	end;
}
moro_cav.gat,57,69,3	script	�Ԃ���#a1	844,{/* 65382 */
	if(checkquest(201720) == 0) {	// �r�I�X�̓����U��
		mes "[��C�ǐՑ���]";
		mes "�����̓����N������h���A���R��";
		mes "�őO���ł��B";
		mes "���̓����N�̑��Ղ�ǂ��Ă��܂��B";
		mes "�@";
		mes "�]^ff0000�r�I�X�̓����U���̂���";
		mes "�@���ꂪ�o���܂���^000000�]";
		close;
	}
	mes "�]�Ԃ��Ԃ�����]";
	next;
	if(select("�Ԃ��Ԃɓ���","�Ԃ��Ԃɓ���Ȃ�") == 2) {
		mes "�]���̏����ɂ����]";
		close;
	}
	switch(mdenter("mors")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[mors] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		setquest 9319; //state=1
		setquest 9318; //state=1
		setquest 118930; //state=1
		close2;
		//warp "1@rev.gat",26,181;
		end;
	case 1:	// �p�[�e�B�[������
		mes "�]�p�[�e�B�[���̂݁A";
		mes "�@�������A���_���W������";
		mes "�@���ꂷ�邱�Ƃ��ł��܂��]";
		close;
	case 2:	// �_���W�������쐬
		mes "�]�p�[�e�B�[���[�_�[��";
		mes "�@�������A���_���W������";
		mes "�@�������Ă��Ȃ���Ԃł��]";
		close;
	default:	// ���̑��G���[
		close;
	}
OnTimer15000:
	initnpctimer;
	misceffect 239; //65382
	end;
OnInit:
	initnpctimer;
	waitingroom "�����X�̓��A����",0; //65382
	end;
}

1@rev.gat,27,181,0	script	#RZ�������A���X�^�[�g	139,1,1,{/* 75055 (hide)*/
}
1@rev.gat,34,120,0	script	#RZ�������A���G�t�F�N�g	139,{/* 75056 (hide)*/}
1@rev.gat,34,48,0	script	#RZ�������A���G�t�F�N�g	139,{/* 75057 (hide)*/}
1@rev.gat,31,181,0	script	#RZ�C�x���g_1	139,{/* 75058 (hide)*/
OnStart:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#RZ�C�x���g_1")+ "::OnKilled";
	monster '@map$,38,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,182,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,182,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,70,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,70,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,70,182,"�����X�E�O�[��",3001,1,'@label$;
	end;
OnKilled:
	set '@count,getmapmobs(getmdmapname("1@rev.gat"),getmdnpcname("#RZ�C�x���g_1")+ "::OnKilled");
	if('@count <= 0) {
		hideoffnpc getmdnpcname("���_�A���N#RZ�C�x���g_2"); //69673
		hideoffnpc getmdnpcname("�������C�O���h#������_0"); //81075
		donpcevent getmdnpcname("#RZ�C�x���g_1-2")+ "::OnStart"
	}
	end;
}
1@rev.gat,31,181,0	script	#RZ�C�x���g_1-2	139,{/* 75059 */
OnStart:
	initnpctimer;
	announce "���_�A���N : �܂���܂����ˁB", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer3000:
	announce "�C�O���h : �����N�͂ǂ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer6000:
	announce "���_�A���N : ����ȂɃ����N�l�ɉ�����ł����H�@�N�N�N�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer9000:
	announce "���_�A���N : �����̓����N�l�������g�̐��_�Ŏx�z����Ă����ԁB", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer12000:
	announce "���_�A���N : �����A���ׂĂ������N�l�̐��E�ł��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer15000:
	announce "�C�O���h : �Ȃ񂾂ƁI", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer18000:
	announce "���_�A���N : ���Ȃ����̎v���ʂ�ɂ͂����Ȃ��ł��傤�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer21000:
	announce "���_�A���N : ���������N�l�����҂��ł��B�����N�l������ꏊ�܂ňē����܂��傤�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer24000:
	hideonnpc "���_�A���N#RZ�C�x���g_2"; //69673
	end;
OnTimer27000:
	stopnpctimer;
	hideoffnpc "#RZ�ړ�_30_0qj"; //69829
	hideoffnpc "#RZ�ړ�_31_0qj"; //69830
	end;
}
1@rev.gat,20,181,0	script	#�����X�����X�^�[�g	139,{/* 75060 */
select("�C�O���h:�L�h:�q�V�G:�N�����Ȃ�")
mes "�]���Ԃ���������-";
close;
}
1@rev.gat,25,183,5	script	�������C�O���h#����	751,{/* 75061 */}
1@rev.gat,25,183,5	script	�L�h#����	884,{/* 75062 (hide)*/}
1@rev.gat,25,183,5	script	�q�V�G#����	623,{/* 75063 (hide)*/}
1@rev.gat,60,184,5	script	�������C�O���h#������	751,{/* 75064 (hide)*/}
1@rev.gat,60,184,5	script	�L�h#������	884,{/* 75065 (hide)*/}
1@rev.gat,60,184,5	script	�q�V�G#������	623,{/* 75066 (hide)*/}
1@rev.gat,64,181,4	script	���_�A���N#RZ�C�x���g_2	3029,{/* 75067 (hide)*/}
1@rev.gat,34,126,4	script	���_�A���N#RZ�C�x���g_3	3029,{/* 75068 (hide)*/}

1@rev.gat,34,55,4	script	���_�A���N#RZ�C�x���g_5	3029,{/* 75070 (hide)*/}
1@rev.gat,112,48,4	script	���_�A���N#RZ�C�x���g_6	3029,{/* 75071 (hide)*/}
1@rev.gat,63,181,0	warp	#RZ�ړ�_30	8,8,1@rev.gat,103,177	//75072
1@rev.gat,47,181,0	warp	#RZ�ړ�_31	8,8,1@rev.gat,103,177	//75073
1@rev.gat,31,181,0	warp	#RZ�ړ�_32	8,8,1@rev.gat,103,177	//75074
1@rev.gat,104,176,0	script	#RZ�C�x���g_3	139,1,1,{/* 75075 (hide)*/
	initnpctimer;
	hideonnpc "#RZ�C�x���g_3_0qj"; //69840
	hideoffnpc "�������C�O���h#�����N_0"; //69841
	hideoffnpc "�����N??#RZ1_0qj"; //69725
	unittalk getcharid(3),strcharinfo(0)+ " : �����N!?";
	end;
OnTimer2500:
	donpcevent getmdnpcname("�������C�O���h#�����N")+ "::OnTalk1";
	end;
OnTimer5500:
	donpcevent getmdnpcname("�������C�O���h#�����N")+ "::OnTalk2";
	misceffect 60,""; //self
	end;
OnTimer6500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk1";
	end;
OnTimer9500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk2";
	end;
OnTimer12500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk3";
	end;
OnTimer15500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk4";
	misceffect 169, "�����N??#RZ1_0qj"; //69725
	end;
OnTimer18500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk5";
	misceffect 225, "�����N??#RZ1_0qj"; //69725
	end;
OnTimer21500:
	stopnpctimer;
	hideonnpc "�����N??#RZ1_0qj"; //69725
	monster getmdmapname("1@rev.gat"),111,178,"�����N??",2998,1,getmdnpcname("#RZ�C�x���g_3")+ "::OnKilled";
	end;
OnKilled:
	startnpctimer;
	hideoffnpc "�����N??#RZ1_0qj"; //69725
	hideoffnpc "�������C�O���h#�����N_0"; //69841
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk6";
	end;
OnTimer24500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk7";
	end;
OnTimer27500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk8";
	end;
OnTimer30500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk9";
	hideoffnpc "�����N??#RZ1_0qj"; //69725
	end;
OnTimer33500:
	donpcevent getmdnpcname("�������C�O���h#�����N")+ "::OnTalk3";
	end;
OnTimer36500:
	donpcevent getmdnpcname("�������C�O���h#�����N")+ "::OnTalk4";
	end;
OnTimer39500:
	hideonnpc "�������C�O���h#�����N_0"; //69841
	end;
OnTimer45500:
	announce "�C�O���h : ���A���킟���I�@�Ȃ񂾂���́c�c�B", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer47500:
	stopnpctimer;
	hideoffnpc "#RZ�ړ�_1_0qj"; //69551
	hideoffnpc "#RZ�ړ�_2_0qj"; //69552
	hideoffnpc "#RZ�ړ�_3_0qj"; //69553
	hideoffnpc "#RZ�ړ�_4_0qj"; //69554
	end;
}
1@rev.gat,102,180,5	script	�������C�O���h#�����N	751,{/* 75076 */
	mes "[�C�O���h]";
	mes "�C��t����I";
	mes "���̃����N������Ȃɂ�������";
	mes "������Ƃ͎v���Ȃ��B";
	close;
OnTalk1:
	unittalk "�C�O���h : ���������c�c���ꂾ���T�d�ȃ����N������Ȃɂ������茩����Ƃ́B";
	end;
OnTalk2:
	unittalk "�C�O���h : �c�c�{���Ƀ����N��!?";
	end;
OnTalk3:
	unittalk "�C�O���h : �����I�@�҂āI�@�����₪�����ȁI";
	end;
OnTalk4:
	unittalk "�C�O���h : �}���Œǂ������邼�B������ɍs�����B";
	end;
}
1@rev.gat,102,180,5	script	�L�h#�����N�O	884,{/* 75077 (hide)*/}
1@rev.gat,102,180,5	script	�q�V�G#�����N�O	623,{/* 75078 (hide)*/}
1@rev.gat,111,178,4	script	�����N??#RZ1	1916,{/* 75079 */
	end;
OnTalk1:
	unittalk "�����N?? : �ǂ������܂ŗ����ȁA�l�Ԃ�B";
	end;
OnTalk2:
	unittalk "�����N?? : �����A�{���Ɏ���j�~�ł���Ǝv���Ă���̂��H";
	end;
OnTalk3:
	unittalk "�����N?? : �������낤�B�J���ɂ����܂ŗ���������������Ă�낤�B";
	end;
OnTalk4:
	unittalk "�����N?? : ���Ƃ����S�ɗ͂��񕜂��Ă��Ȃ������Ƃ��Ă����̖����Ȃ��B";
	end;
OnTalk5:
	unittalk "�����N?? : ���̋��|��^���Ă��!!";
	end;
OnTalk6:
	unittalk "�����N?? : �ӂށB�񕜂��Ă��Ȃ���Ԃł͂��̒��x�̗͂����o���ʂ��B";
	end;
OnTalk7:
	unittalk "�����N?? : �܂��������낤�B����������������Ƃ��悤�B";
	end;
OnTalk8:
	unittalk "�����N?? : �����l�ԋ��A��ׁB���O��̓����N�l��|�����񂾁B";
	end;
OnTalk9:
	unittalk "�����N?? : �߂��đ��̐l�ԋ��Ə����̊�тł������������Ă�����ǂ����H�@�N�N�N�B";
	end;
}

1@rev.gat,33,120,4	script	�������C�O���h#2���	751,{/* 75080 */}
1@rev.gat,33,120,4	script	�L�h#2���	884,{/* 75081 (hide)*/}
1@rev.gat,33,120,4	script	�q�V�G#2���	623,{/* 75082 (hide)*/}
1@rev.gat,33,120,0	script	#��~�G�t�F�N�gRZ1	139,{/* 75083 (hide)*/}
1@rev.gat,33,108,0	script	#2�����ڃf�o�t_1	139,{/* 75084 (hide)*/}
1@rev.gat,33,112,0	script	#2�����ڃf�o�t_2	139,{/* 75085 (hide)*/}
1@rev.gat,33,116,0	script	#2�����ڃf�o�t_3	139,{/* 75086 (hide)*/}
1@rev.gat,33,120,0	script	#2�����ڃf�o�t_4	139,{/* 75087 (hide)*/}
1@rev.gat,33,124,0	script	#2�����ڃf�o�t_5	139,{/* 75088 (hide)*/}
1@rev.gat,33,128,0	script	#2�����ڃf�o�t_6	139,{/* 75089 (hide)*/}
1@rev.gat,33,131,0	script	#2�����ڃf�o�t_7	139,{/* 75090 (hide)*/}
1@rev.gat,34,120,0	script	#���G�t�F�N�g�p	139,{/* 75091 */}
1@rev.gat,35,119,0	script	#�퓬_1RZ1	139,2,2,{/* 75092 (hide)*/
	hideonnpc getmdnpcname("#�퓬_1RZ1_0qj"); //69796
	donpcevent getmdnpcname("#�퓬_1RZ1_timer")+ "::OnStart";
	end;
}
1@rev.gat,35,119,0	script	#�퓬_1RZ1_timer	139,{/* 75093 */
misceffect 89, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �N�N�N�B�܂�܂ƈ���������Ƃ͋����Ȑl�����ł��ˁB�ǂ��ł����������̂ƕ��������C���́B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : ��قǂ̃����N�l�͎������o�������e�ł��B�{���̃����N�l�͌��݋x�����Ƃ��Ă��܂��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �������c�c�����܂ł��ă����N�l�ɉ�����Ƃ́B�l�Ԃł��邠�Ȃ����������N�l�܂ł��ǂ蒅����Ƃ͎v���܂��񂪁c�c�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �����ł��傤�B���Ȃ����������N�l�ɉ���i�����邩�ǂ����A���������č����グ�܂��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : ���܂莄�����]�����Ȃ��ł���������H�@�͕s���Ɣ��f�����炱�����痧�������Ă��������܂��̂Łc�c�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �����̍Ő[���ɂ��ǂ���Ȃ��悤�Ȏ҂ȂǁA�����N�l�ɉ���i�͂���܂���B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �����A���Ȃ����̗́A�����Ă��������܂��傤�I�@�N�N�N!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 37884, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 37983, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 37973, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 37917, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 39730, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 39496, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 39190, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 39467, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
announce "���_�A���N : ���̕����B��I�@�����Ƌ��|�Ƌ�ɂ�^����̂ł��I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 39580, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 39086, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 39630, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 39899, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(25, 116), dir: 4, name: "�����X�E�O�[��")
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 40387, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 42252, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
@spawn(type: BL_MOB, ID: 1215, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 37232, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �܂�����Ȃ��c�c�I�@�����Ƌ��|���I�@��ɂ��I�@����킹��̂ł�!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 46126, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 47198, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 9687, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 31206, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 36970, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 38404, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 36796, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �N�N�N�c�c�B�����ł���B�����ƒ�R���Ȃ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 16696, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 17524, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 17388, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 18560, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 38621, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 38560, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 38687, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
@spawn(type: BL_MOB, ID: 38764, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(25, 119), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
@spawn(type: BL_MOB, ID: 38695, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : ���̌����񂾒ʂ�A�͂���҂̂悤�ł��ˁB�N�N�N�c�c�ʔ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 42600, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 42651, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 42898, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 43094, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 43182, speed: 200, option: 0, view: 3003, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�A�[�`���[")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 124, "�������C�O���h#2���_0q"; //69726
misceffect 220, "�������C�O���h#2���_0q"; //69726
misceffect 368, "�������C�O���h#2���_0q"; //69726
misceffect 9, "#���G�t�F�N�g�p_0qj"; //69768
@spawn(type: BL_MOB, ID: 44259, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 44346, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 44189, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 9666, speed: 1000, option: 0, view: 3001, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �N�N�N�c�c�Ȃ��Ȃ����ԂƂ��ł��ˁI", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
announce "���_�A���N : �����c�c���܂ő����܂����ˁB�N�N�N�I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
misceffect 74, "#��~�G�t�F�N�gRZ1_0qj"; //69729
misceffect 196, "#RZ�������A���G�t�F�N�g"; //77455
hideonnpc "#2�����ڃf�o�t_1_0qj"; //69730
hideonnpc "#2�����ڃf�o�t_2_0qj"; //69731
hideonnpc "#2�����ڃf�o�t_3_0qj"; //69468
hideonnpc "#2�����ڃf�o�t_4_0qj"; //69732
hideonnpc "#2�����ڃf�o�t_5_0qj"; //69765
hideonnpc "#2�����ڃf�o�t_6_0qj"; //69766
hideonnpc "#2�����ڃf�o�t_7_0qj"; //69767
hideoffnpc "#RZ�ړ�_5_0qj"; //69555
hideoffnpc "#RZ�ړ�_6_0qj"; //69556
hideoffnpc "#RZ�ړ�_7_0qj"; //69557
hideoffnpc "#RZ�ړ�_8_0qj"; //69561
}
1@rev.gat,34,47,0	script	#�퓬_2RZ1	139,{/* 75094 (hide)*/}
1@rev.gat,34,47,0	script	#�퓬_2RZ1_timer	139,{/* 75095 */}
1@rev.gat,112,48,4	script	�����X�E�����m#RZ1	10029,{/* 75096 (hide)*/}
1@rev.gat,104,47,0	script	#�퓬_3RZ1	139,{/* 75097 (hide)*/}
1@rev.gat,108,51,5	script	�������C�O���h#�{�X��	751,{/* 75098 (hide)*/}
1@rev.gat,108,51,5	script	�L�h#�{�X��	884,{/* 75099 (hide)*/}
1@rev.gat,108,51,5	script	�q�V�G#�{�X��	623,{/* 75100 (hide)*/}
1@rev.gat,106,60,0	script	#�퓬_3RZ2	139,{/* 75101 (hide)*/}
1@rev.gat,120,60,0	script	#�퓬_3RZ3	139,{/* 75102 (hide)*/}
1@rev.gat,120,61,0	script	#�퓬_3RZ4	139,{/* 75103 (hide)*/}
1@rev.gat,120,62,0	script	#�퓬_3RZ5	139,{/* 75104 (hide)*/}
1@rev.gat,120,63,0	script	#�퓬_3RZ6	139,{/* 75105 (hide)*/}
1@rev.gat,120,58,0	script	#�퓬_3RZ7	139,{/* 75106 (hide)*/}
1@rev.gat,106,183,0	warp	#RZ�ړ�_1	5,5,1@rev.gat,33,117	//75972
1@rev.gat,106,172,0	warp	#RZ�ړ�_2	5,5,1@rev.gat,33,117	//75973
1@rev.gat,117,172,0	warp	#RZ�ړ�_3	5,5,1@rev.gat,33,117	//75974
1@rev.gat,117,183,0	warp	#RZ�ړ�_4	5,5,1@rev.gat,33,117	//75975
1@rev.gat,28,125,0	warp	#RZ�ړ�_5	5,5,1@rev.gat,31,50	//75976
1@rev.gat,28,114,0	warp	#RZ�ړ�_6	5,5,1@rev.gat,31,50	//75977
1@rev.gat,39,114,0	warp	#RZ�ړ�_7	5,5,1@rev.gat,31,50	//75978
1@rev.gat,39,125,0	warp	#RZ�ړ�_8	5,5,1@rev.gat,31,50	//75979
1@rev.gat,28,125,0	script	#RZ�ړ�_5a	45,{/* 75980 (hide)*/}
1@rev.gat,28,114,0	script	#RZ�ړ�_6a	45,{/* 75981 (hide)*/}
1@rev.gat,39,114,0	script	#RZ�ړ�_7a	45,{/* 75982 (hide)*/}
1@rev.gat,39,125,0	script	#RZ�ړ�_8a	45,{/* 75983 (hide)*/}

1@rev.gat,28,53,0	script	#RZ�ړ�_13a	45,{/* 75988 (hide)*/}
1@rev.gat,28,42,0	script	#RZ�ړ�_14a	45,{/* 75989 (hide)*/}
1@rev.gat,39,42,0	script	#RZ�ړ�_15a	45,{/* 75990 (hide)*/}
1@rev.gat,39,53,0	script	#RZ�ړ�_16a	45,{/* 75991 (hide)*/}
1@rev.gat,28,53,0	warp	#RZ�ړ�_13	5,5,1@rev.gat,104,48
1@rev.gat,28,42,0	warp	#RZ�ړ�_14	5,5,1@rev.gat,104,48
1@rev.gat,39,42,0	warp	#RZ�ړ�_15	5,5,1@rev.gat,104,48
1@rev.gat,39,53,0	warp	#RZ�ړ�_16	5,5,1@rev.gat,104,48
1@rev.gat,112,56,3	script	#RZ�ړ�_17a	723,{/* 75996 (hide)*/
	mes "�]^ff0000��������ޏo���鎖��";
	mes "�@��V���󂯎�鎖���o���܂��B^000000";
	mes "�@�O�ɏo�܂����H�]";
	next;
	if(select("������","�͂�") == 1) {
		mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
		close;
	}
	mes "�]���Ȃ��͊O�ɏo���]";
	close2;
	delquest 9318;
	getexp 1537172,0; //99999999
	getexp 0,0; //99999999
	getexp 0,4400000; //18450835
		//delquest 116514; //2����??
	setquest 116514; //state=1
	compquest 116514;
	getitem 6684,1;
	setquest 201725; //state=1 //1����??
	warp "moro_cav.gat",59,63;
	end;
}
