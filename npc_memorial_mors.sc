@spawn(type: BL_MOB, ID: 40236, speed: 200, option: 0, view: 2998, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����N??")
@nomalattack(src: "2998:�����N??:0qj1@rev.gat"(40236), dst: , damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(), dst: 40236, damage: 64, sDelay: 260, dDelay: 440, tick: 432013023)

@spawn(type: BL_MOB, ID: 23072, speed: 195, option: 0, view: 3007, pos: "0qj1@rev.gat"(34, 121), dir: 0, name: "�C�O���h�̍�")

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
OnTouch:
	hideonnpc "#RZ�������A���X�^�[�g"; //70777
	hideoffnpc "#RZ�C�x���g_1"; //70780
	misceffect 1, "#RZ�������A���X�^�[�g"; //70777
	end;
}
1@rev.gat,34,120,0	script	#RZ_EFFECT01	139,{/* 75056 (hide)*/
OnStart:
OnTimer2000:
	initnpctimer;
	misceffect 196; //77455
	end;
OnStop:
	stopnpctimer;
	end;
}
1@rev.gat,34,48,0	script	#RZ_EFFECT02	139,{/* 75057 (hide)*/
OnStart:
OnTimer2000:
	initnpctimer;
	misceffect 196; //77455
	end;
OnStop:
	stopnpctimer;
	end;
}
1@rev.gat,31,181,0	script	#RZ�C�x���g_1	139,5,5,{/* 75058 (hide)*/
OnTouch:
	initnpctimer;
	end;
OnTimer2000:
	announce "�����N : �N���H�@���̋x���̎ז�������̂́B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer4000:
	announce "�]�ǂ�����Ƃ��Ȃ���������B�ǂ���炱���������N�̐�����ŊԈႢ�Ȃ��悤���]", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer8000:
	announce "�H�H�H : �҂��Ă���I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer10000:
	stopnpctimer;
	misceffect 60,""; //self
	hideonnpc "#RZ�C�x���g_1"; //70780
	hideoffnpc "#RZ�C�x���g_1-2"; //70781
	end;
}
1@rev.gat,31,181,0	script	#RZ�C�x���g_1-2	139,5,5,{/* 75059 */
OnTouch:
	mes "�]������琺����������H";
	mes "�@�N�������̂��낤���]";
	next;
	set 'menu,select("�C�O���h","�L�h","�q�V�G","�N�����Ȃ�");
	hideonnpc "#RZ�C�x���g_1"; //70780
	switch('menu) {
	case 1:
		hideoffnpc "�������C�O���h#����"; //70783
		break;
	case 2:
		hideoffnpc "�L�h#����"; //70783
		break;
	}
	mes "�]���Ԃ���������-";
	close;
OnStart:
	initnpctimer;
	announce "���_�A���N : �܂���܂����ˁB", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer3000:
	if('menu == 1)
		announce "�C�O���h : �����N�͂ǂ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	else if('menu == 2)
		announce "�L�h : �����N�͂ǂ��ɂ���H", 0x1, 0x00ebff, 0x190, 12, 0, 0;
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
	if('menu == 1)
		announce "�C�O���h : �Ȃ񂾂ƁI", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	else if('menu == 2)
		announce "�L�h : �ق��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
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
	hideoffnpc "#RZ�ړ�_30"; //69829
	hideoffnpc "#RZ�ړ�_31"; //69830
	end;
}
1@rev.gat,20,181,0	script	#�����X�����X�^�[�g	139,{/* 75060 */
OnStart:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#RZ�C�x���g_1")+ "::OnKilled";
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"))
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
		if('menu == 1) {
			hideonnpc getmdnpcname("�������C�O���h#����"); //81075
			hideoffnpc getmdnpcname("�������C�O���h#������"); //81075
		} else if('menu == 2) {
			hideonnpc getmdnpcname("�L�h#����"); //81075
			hideoffnpc getmdnpcname("�L�h#������"); //81075
		}
		donpcevent getmdnpcname("#RZ�C�x���g_1-2")+ "::OnStart"
	}
	end;
}
1@rev.gat,25,183,5	script	�������C�O���h#����	751,{/* 75061 */
	mes "[�C�O���h]";
	mes "�C��t����I";
	mes "�G�����Ă��邼�I";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer100:
	unittalk "�C�O���h : �ӂ��B�Ԃɍ������悤���ȁB";
	end;
OnTimer3100:
	donpcevent "#�����X�����X�^�[�g::OnStart";
	unittalk "�C�O���h : �Z�c�c����A�i�ߊ��ɋ��͂�����Ă����B�ꏏ�ɉ����s�����Ă���B";
	end;
OnTimer6100:
	stopnpctimer;
	unittalk "�C�O���h : ";	//?
	end;
}
1@rev.gat,25,183,5	script	�L�h#����	884,{/* 75062 (hide)*/
	mes "[�L�h]";
	// ������
	close;
OnStart:
	initnpctimer;
	end;
OnTimer100:
	unittalk "�L�h : �Ԃɍ��������B";
	end;
OnTimer3100:
	donpcevent "#�����X�����X�^�[�g::OnStart";
	unittalk "�L�h : ���[���ɂ͓`���Ă����B����̎����߂Â��Ă���B�����ꏏ�ɍs�����Ă���B";
	end;
OnTimer6100:
	stopnpctimer;
	unittalk "�L�h : ���������G����̂��o�܂����B�C��t����I";
	end;
}
1@rev.gat,25,183,5	script	�q�V�G#����	623,{/* 75063 (hide)*/}
1@rev.gat,60,184,5	script	�������C�O���h#������	751,{/* 75064 (hide)*/
	mes "[�C�O���h]";
	mes "���_�݂Ă��Ȋ炵�₪���āI";
	close;
}
1@rev.gat,60,184,5	script	�L�h#������	884,{/* 75065 (hide)*/
	mes "[�L�h]";
	mes "�ڂ̑O�̓G�ɏW������B";
	close;
}
1@rev.gat,60,184,5	script	�q�V�G#������	623,{/* 75066 (hide)*/}
1@rev.gat,64,181,4	script	���_�A���N#RZ�C�x���g_2	3029,{/* 75067 (hide)*/}
1@rev.gat,34,126,4	script	���_�A���N#RZ�C�x���g_3	3029,{/* 75068 (hide)*/
	end;
OnTalk1:
	unittalk "���_�A���N : �c�c����Ȃ��̂ł������Ȃ����̗͂́H";
	end;
OnTalk2:
	unittalk "���_�A���N : ���]���܂�����B�����N�l�̉񕜂ɕK�v�ȃG�l���M�[���Ƃ��Ă͓���͕s���ł��ˁB";
	end;
OnTalk3:
	unittalk "���_�A���N : �������痧������Ȃ���!!�@�������Ȃ����ɋ����͖����B";
	end;
}

1@rev.gat,34,55,4	script	���_�A���N#RZ�C�x���g_5	3029,{/* 75070 (hide)*/
	end;
OnTalk1:
	unittalk "���_�A���N : �c�c����Ȃ��̂ł������Ȃ����̗͂́H";
	end;
OnTalk2:
	unittalk "���_�A���N : ���]���܂�����B�����N�l�̉񕜂ɕK�v�ȃG�l���M�[���Ƃ��Ă͓���͕s���ł��ˁB";
	end;
OnTalk3:
	unittalk "���_�A���N : �������痧������Ȃ���!!�@�������Ȃ����ɋ����͖����B";
	end;
}
1@rev.gat,112,48,4	script	���_�A���N#RZ�C�x���g_6	3029,{/* 75071 (hide)*/}
1@rev.gat,63,181,0	warp	#RZ�ړ�_30	8,8,1@rev.gat,103,177	//75072
1@rev.gat,47,181,0	warp	#RZ�ړ�_31	8,8,1@rev.gat,103,177	//75073
1@rev.gat,31,181,0	warp	#RZ�ړ�_32	8,8,1@rev.gat,103,177	//75074
1@rev.gat,104,176,0	script	#RZ�C�x���g_3	139,1,1,{/* 75075 (hide)*/
	initnpctimer;
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"))
	hideonnpc "#RZ�C�x���g_3"; //69840
	hideoffnpc "�������C�O���h#�����N"; //69841
	hideoffnpc "�����N??#RZ1"; //69725
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
	misceffect 169, "�����N??#RZ1"; //69725
	end;
OnTimer18500:
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk5";
	misceffect 225, "�����N??#RZ1"; //69725
	end;
OnTimer21500:
	stopnpctimer;
	hideonnpc "�����N??#RZ1"; //69725
	monster getmdmapname("1@rev.gat"),111,178,"�����N??",2998,1,getmdnpcname("#RZ�C�x���g_3")+ "::OnKilled";
	end;
OnKilled:
	initnpctimer;
	setnpctimer 22000;
	hideoffnpc "�����N??#RZ1"; //69725
	//hideoffnpc "�������C�O���h#�����N"; //69841
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
	hideoffnpc "�����N??#RZ1"; //69725
	end;
OnTimer33500:
	donpcevent getmdnpcname("�������C�O���h#�����N")+ "::OnTalk3";
	end;
OnTimer36500:
	donpcevent getmdnpcname("�������C�O���h#�����N")+ "::OnTalk4";
	end;
OnTimer39500:
	hideonnpc "�������C�O���h#�����N"; //69841
	end;
OnTimer45500:
	announce "�C�O���h : ���A���킟���I�@�Ȃ񂾂���́c�c�B", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	announce "�L�h : �Ȃ񂾂����!!�@�����c�c�I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer47500:
	stopnpctimer;
	hideoffnpc "#RZ�ړ�_1"; //69551
	hideoffnpc "#RZ�ړ�_2"; //69552
	hideoffnpc "#RZ�ړ�_3"; //69553
	hideoffnpc "#RZ�ړ�_4"; //69554
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
1@rev.gat,102,180,5	script	�L�h#�����N�O	884,{/* 75077 (hide)*/
	mes "[�L�h]";
	mes "�C��t����I";
	mes "���̃����N������Ȃɂ�������";
	mes "������Ƃ͎v���Ȃ��B";
	close;
OnTalk1:
	unittalk "�L�h : ���������c�c���ꂾ���T�d�ȃ����N������Ȃɂ������茩����Ƃ́B";
	end;
OnTalk2:
	unittalk "�L�h : �c�c�{���Ƀ����N��!?";
	end;
OnTalk3:
	unittalk "�L�h : �����A�����₪�������B�������c�c�D�ɗ�����ȁB";
	end;
OnTalk4:
	unittalk "�L�h : �d���Ȃ��A�ǂ������悤�B��ɍs���B";
	end;
}
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
1@rev.gat,33,120,4	script	�L�h#2���	884,{/* 75081 (hide)*/
	mes "[�L�h]";
	mes "�����B�Ȃ񂾂���́B";
	mes "�S��������B";
	close;
}
1@rev.gat,33,120,4	script	�q�V�G#2���	623,{/* 75082 (hide)*/}
1@rev.gat,33,120,0	script	#��~�G�t�F�N�gRZ1	139,{/* 75083 (hide)*/
OnStart:
OnTimer9950:
	initnpctimer;
	misceffect 74;
	end;
OnStop:
	stopnpctimer;
	end;
}
1@rev.gat,33,108,0	script	#2�����ڃf�o�t_1	139,{/* 75084 (hide)*/}
1@rev.gat,33,112,0	script	#2�����ڃf�o�t_2	139,{/* 75085 (hide)*/}
1@rev.gat,33,116,0	script	#2�����ڃf�o�t_3	139,{/* 75086 (hide)*/}
1@rev.gat,33,120,0	script	#2�����ڃf�o�t_4	139,{/* 75087 (hide)*/}
1@rev.gat,33,124,0	script	#2�����ڃf�o�t_5	139,{/* 75088 (hide)*/}
1@rev.gat,33,128,0	script	#2�����ڃf�o�t_6	139,{/* 75089 (hide)*/}
1@rev.gat,33,131,0	script	#2�����ڃf�o�t_7	139,{/* 75090 (hide)*/}
1@rev.gat,34,120,0	script	#���G�t�F�N�g�p	139,{/* 75091 */}
1@rev.gat,35,119,0	script	#�퓬_1RZ1	139,2,2,{/* 75092 (hide)*/
	hideonnpc getmdnpcname("#�퓬_1RZ1"); //69796
	monster getmdmapname("1@rev.gat"),34,121,"�C�O���h�̍�",3007,1,getmdnpcname("#�퓬_1RZ1")+ "::OnKilled1";
	donpcevent getmdnpcname("#�퓬_1RZ1_timer")+ "::OnStart";
	end;
OnSpawn:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#�퓬_1RZ1")+ "::OnKilled2";
	monster '@map$,38,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,182,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,180,"�����X�E�O�[��",3001,1,'@label$;
	misceffect 124, "�������C�O���h#2���"; //69726
	misceffect 220, "�������C�O���h#2���"; //69726
	misceffect 368, "�������C�O���h#2���"; //69726
	misceffect 9, "#���G�t�F�N�g�p"; //69768
	end;
OnKilled:
	//25�̈ȏ��OK
}
1@rev.gat,35,119,0	script	#�퓬_1RZ1_timer	139,{/* 75093 */
OnStart:
	initnpctimer;
	//hideonnpc getmdnpcname("#�퓬_1RZ1"); //69796		//���̂�2��hide
	misceffect 89, getmdnpcname("#RZ_EFFECT01"); //77455
	announce "���_�A���N : �N�N�N�B�܂�܂ƈ���������Ƃ͋����Ȑl�����ł��ˁB�ǂ��ł����������̂ƕ��������C���́B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer200:
	misceffect 196, getmdnpcname("#RZ_EFFECT01"); //77455
	end;
OnTimer1600:
	donpcevent getmdnpcname("#��~�G�t�F�N�gRZ1")+ "::OnStart";
	end;
OnTimer1850:
	donpcevent getmdnpcname("#RZ_EFFECT01")+ "::OnStart";
	end;
OnTimer3700:
	announce "���_�A���N : ��قǂ̃����N�l�͎������o�������e�ł��B�{���̃����N�l�͌��݋x�����Ƃ��Ă��܂��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer8700:
	announce "���_�A���N : �������c�c�����܂ł��ă����N�l�ɉ�����Ƃ́B�l�Ԃł��邠�Ȃ����������N�l�܂ł��ǂ蒅����Ƃ͎v���܂��񂪁c�c�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer13700:
	announce "���_�A���N : �����ł��傤�B���Ȃ����������N�l�ɉ���i�����邩�ǂ����A���������č����グ�܂��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer18700:
	announce "���_�A���N : ���܂莄�����]�����Ȃ��ł���������H�@�͕s���Ɣ��f�����炱�����痧�������Ă��������܂��̂Łc�c�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer23700:
	announce "���_�A���N : �����̍Ő[���ɂ��ǂ���Ȃ��悤�Ȏ҂ȂǁA�����N�l�ɉ���i�͂���܂���B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer28700:
	announce "���_�A���N : �����A���Ȃ����̗́A�����Ă��������܂��傤�I�@�N�N�N!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer32700:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer48700:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer63700:
	announce "���_�A���N : ���̕����B��I�@�����Ƌ��|�Ƌ�ɂ�^����̂ł��I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer80700:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer93700:
	announce "���_�A���N : �܂�����Ȃ��c�c�I�@�����Ƌ��|���I�@��ɂ��I�@����킹��̂ł�!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer108700:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer125700:
	announce "���_�A���N : �N�N�N�c�c�B�����ł���B�����ƒ�R���Ȃ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer140700:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer163700:
	announce "���̌����񂾒ʂ�A�͂���҂̂悤�ł��ˁB�N�N�N�c�c�ʔ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer188700:
	donpcevent getmdnpcname("#�퓬_1RZ1")+ "::OnSpawn";
	end;
OnTimer215700:
	if('@count) {
		//fail
	}
	else
		announce "���_�A���N : �N�N�N�c�c�Ȃ��Ȃ����ԂƂ��ł��ˁI", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer217700:
	announce "���_�A���N : �����c�c���܂ő����܂����ˁB�N�N�N�I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer223700:
	donpcevent getmdnpcname("#RZ_EFFECT01"); //77455
	donpcevent getmdnpcname("#��~�G�t�F�N�gRZ1"); //69729
	hideonnpc "#2�����ڃf�o�t_1"; //69730
	hideonnpc "#2�����ڃf�o�t_2"; //69731
	hideonnpc "#2�����ڃf�o�t_3"; //69468
	hideonnpc "#2�����ڃf�o�t_4"; //69732
	hideonnpc "#2�����ڃf�o�t_5"; //69765
	hideonnpc "#2�����ڃf�o�t_6"; //69766
	hideonnpc "#2�����ڃf�o�t_7"; //69767
	hideoffnpc "#RZ�ړ�_5"; //69555
	hideoffnpc "#RZ�ړ�_6"; //69556
	hideoffnpc "#RZ�ړ�_7"; //69557
	hideoffnpc "#RZ�ړ�_8"; //69561
	end;
}
1@rev.gat,34,47,0	script	#�퓬_2RZ1	139,1,1,{/* 75094 (hide)*/
	hideonnpc getmdnpcname("#�퓬_2RZ1"); //69796
	donpcevent getmdnpcname("#�퓬_2RZ1_timer")+ "::OnStart";
	end;
OnSpawn:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#�퓬_1RZ1")+ "::OnKilled2";
	monster '@map$,38,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,182,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,180,"�����X�E�O�[��",3001,1,'@label$;
	misceffect 124, "�������C�O���h#2���"; //69726
	misceffect 220, "�������C�O���h#2���"; //69726
	misceffect 368, "�������C�O���h#2���"; //69726
	misceffect 9, "#���G�t�F�N�g�p"; //69768
	end;
OnKilled:
	//6�̈ȉ���NG
}
1@rev.gat,34,47,0	script	#�퓬_2RZ1_timer	139,{/* 75095 */
OnStart:
	initnpctimer;
	misceffect 89, getmdnpcname("#RZ_EFFECT02"); //77455
	announce "���_�A���N : ���̕�����|���ĉ�����ꂽ�Ǝv���Ă���悤�ł����A���̋�Ԃ̓����N�l�̈ӎv�ɂ��i�����Ă��܂��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer500:
	donpcevent getmdnpcname("#RZ_EFFECT02")+ "::OnStart";
	end;
OnTimer4000:
	announce "���_�A���N : �����̎��͂ł͔����o���܂����H�@�N�N�N�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer4000:
	announce "���_�A���N : �������c�c�������B��͂肠�Ȃ����̍��̓����N�l�̉񕜂ɖ𗧂������ł��ˁB", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer9000:
	announce "���_�A���N : ���̍��Ƌ�ɂ��тɂ��č����グ�܂��傤�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer14000:
	announce "���_�A���N : ���Ȃ����̍��̓����N�l�̌��ƂȂ���ƂȂ�̂ł��B����͌��h�Ȏ��ł���I�@�N�N�N!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer19000:
	announce "���_�A���N : �����A�s���Ȃ������̕����B��!!�@���̎҂����̓��̂ƍ��������􂫁A�����N�l�ɕ�����̂ł��I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer24000:
	announce "���_�A���N : �������A��قǂƓ��l�A�͕s���Ɣ��f�����炱�����痧�������Ă��������܂����ˁc�c�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer29000:
	announce "���_�A���N : �N�N�N�c�c���������ɂ��̗͂𔭊����Ă��������I�@�����N�l�̂��߂�!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer33000:
	donpcevent getmdnpcname("#�퓬_2RZ1")+ "::OnSpawn";
	end;
OnTimer49000:
	announce "���_�A���N : ���̐S�n�悢���o�B�c�c�f���炵��!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer74500:
	announce "���_�A���N : �����N�l�ɍv���o���鎖�A���h�Ɏv���Ȃ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer99500:
	announce "���_�A���N : �����Ƃł��I�����Ɨ͂�!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer139500:
	announce "���_�A���N : �����ł���B�N�b�N�B�����Ƒ��~���Ȃ����c�c�I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer184000:
	announce "���_�A���N : ���ւ̋��|���Y�������N�l�̗͂ɂȂ�̂ł��I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer209000:
	hideoffnpc "���_�A���N#RZ�C�x���g_5"; //69824
	donpcevent "���_�A���N#RZ�C�x���g_5::OnTalk1";
	end;
OnTimer212000:
	donpcevent "���_�A���N#RZ�C�x���g_5::OnTalk2";
	end;
OnTimer215000:
	donpcevent "���_�A���N#RZ�C�x���g_5::OnTalk3";
	end;
OnTimer218000:
	hideonnpc "���_�A���N#RZ�C�x���g_5"; //69824
	end;
OnTimer223000:
	hideoffnpc "#RZ�ړ�_13a"; //70387
	hideoffnpc "#RZ�ړ�_14a"; //70388
	hideoffnpc "#RZ�ړ�_15a"; //70389
	hideoffnpc "#RZ�ړ�_16a"; //70437
	end;
}
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
1@rev.gat,28,125,0	warp	#RZ�ړ�_5a	5,5,moro_cav.gat,59,63
1@rev.gat,28,114,0	warp	#RZ�ړ�_6a	5,5,moro_cav.gat,59,63
1@rev.gat,39,114,0	warp	#RZ�ړ�_7a	5,5,moro_cav.gat,59,63
1@rev.gat,39,125,0	warp	#RZ�ړ�_8a	5,5,moro_cav.gat,59,63

1@rev.gat,28,53,0	warp	#RZ�ړ�_13a	5,5,moro_cav.gat,59,63
1@rev.gat,28,42,0	warp	#RZ�ړ�_14a	5,5,moro_cav.gat,59,63
1@rev.gat,39,42,0	warp	#RZ�ړ�_15a	5,5,moro_cav.gat,59,63
1@rev.gat,39,53,0	warp	#RZ�ړ�_16a	5,5,moro_cav.gat,59,63
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





hideonnpc "#RZ�C�x���g_3_0e8"; //74591
hideoffnpc "�L�h#�����N�O_0e8"; //74593
hideoffnpc "�����N??#RZ1_0e8"; //74595
misceffect 169, "�����N??#RZ1_0e8"; //74595
misceffect 225, "�����N??#RZ1_0e8"; //74595
hideonnpc "�����N??#RZ1_0e8"; //74595
@spawn(type: BL_MOB, ID: 13788, speed: 200, option: 0, view: 2998, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����N??")
@nomalattack(src: "2998:�����N??:0e81@rev.gat"(13788), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123187852)
@nomalattack(src: "2998:�����N??:0e81@rev.gat"(13788), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 128607)
@nomalattack(src: "2998:�����N??:0e81@rev.gat"(13788), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2624)
@mob_defeated("2998:�����N??:0e81@rev.gat"(13788))
@update_status(BaseExp: 276690)
@update_status(JobExp: 0)
hideoffnpc "�����N??#RZ1_0e8"; //74595
hideoffnpc "�L�h#�����N�O_0e8"; //74593
hideonnpc "�����N??#RZ1_0e8"; //74595
hideonnpc "�L�h#�����N�O_0e8"; //74593
announce "�L�h : �Ȃ񂾂����!!�@�����c�c�I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
hideoffnpc "#RZ�ړ�_1_0e8"; //71953
hideoffnpc "#RZ�ړ�_2_0e8"; //76956
hideoffnpc "#RZ�ړ�_3_0e8"; //76957
hideoffnpc "#RZ�ړ�_4_0e8"; //76958
@mapmoved(from: 0e81@rev.gat(104, 176), map: 0e81@rev.gat(33, 117))
@changeoption(id: 4631724, opt1: 0, opt2: 0, option: 0, karma: 0)
0e81@rev.gat,33,108,0	script	#2�����ڃf�o�t_1_0e8	139,{/* 74600 (hide)*/}
0e81@rev.gat,33,112,0	script	#2�����ڃf�o�t_2_0e8	139,{/* 74601 (hide)*/}
0e81@rev.gat,33,116,0	script	#2�����ڃf�o�t_3_0e8	139,{/* 74602 (hide)*/}
0e81@rev.gat,35,119,0	script	#�퓬_1RZ1_0e8	139,{/* 74608 */}
0e81@rev.gat,35,119,0	script	#�퓬_1RZ1_timer_0e8	139,{/* 74609 */}
0e81@rev.gat,28,114,0	script	#RZ�ړ�_6_0e8	45,{/* 76960 (hide)*/}
0e81@rev.gat,39,114,0	script	#RZ�ړ�_7_0e8	45,{/* 76961 (hide)*/}
0e81@rev.gat,28,114,0	script	#RZ�ړ�_6a_0e8	45,{/* 76964 (hide)*/}
0e81@rev.gat,39,114,0	script	#RZ�ړ�_7a_0e8	45,{/* 72584 (hide)*/}
0e81@rev.gat,34,120,0	script	#RZ�������A���G�t�F�N�g	139,{/* 74572 (hide)*/}
0e81@rev.gat,34,126,4	script	���_�A���N#RZ�C�x���g_3	3029,{/* 74584 (hide)*/}
0e81@rev.gat,33,120,4	script	�������C�O���h#2���_0e	751,{/* 74596 (hide)*/}
0e81@rev.gat,33,120,4	script	�L�h#2���_0e8	884,{/* 74597 */}
0e81@rev.gat,33,120,4	script	�q�V�G#2���_0e8	623,{/* 74598 (hide)*/}
0e81@rev.gat,33,120,0	script	#��~�G�t�F�N�gRZ1_0e8	139,{/* 74599 (hide)*/}
0e81@rev.gat,33,120,0	script	#2�����ڃf�o�t_4_0e8	139,{/* 74603 (hide)*/}
0e81@rev.gat,33,124,0	script	#2�����ڃf�o�t_5_0e8	139,{/* 74604 (hide)*/}
0e81@rev.gat,33,128,0	script	#2�����ڃf�o�t_6_0e8	139,{/* 74605 (hide)*/}
0e81@rev.gat,33,131,0	script	#2�����ڃf�o�t_7_0e8	139,{/* 74606 (hide)*/}
0e81@rev.gat,34,120,0	script	#���G�t�F�N�g�p_0e8	139,{/* 74607 */}
0e81@rev.gat,28,125,0	script	#RZ�ړ�_5_0e8	45,{/* 76959 (hide)*/}
0e81@rev.gat,39,125,0	script	#RZ�ړ�_8_0e8	45,{/* 76962 (hide)*/}
0e81@rev.gat,28,125,0	script	#RZ�ړ�_5a_0e8	45,{/* 76963 (hide)*/}
0e81@rev.gat,39,125,0	script	#RZ�ړ�_8a_0e8	45,{/* 72585 (hide)*/}
@spawn(type: BL_MOB, ID: 13928, speed: 800, option: 0, view: 1395, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "�C�G���[�N���X�^��")
@spawn(type: BL_MOB, ID: 14323, speed: 800, option: 0, view: 1396, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "�O���[���N���X�^��")
@spawn(type: BL_MOB, ID: 21357, speed: 800, option: 0, view: 1397, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "���b�h�N���X�^��")
@spawn(type: BL_MOB, ID: 24499, speed: 800, option: 0, view: 1398, pos: "0e81@rev.gat"(34, 120), dir: 0, name: "�u���[�N���X�^��")
@spawn(type: BL_MOB, ID: 44621, speed: 195, option: 0, view: 3007, pos: "0e81@rev.gat"(34, 121), dir: 0, name: "�L�h�̍�")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
hideonnpc "#�퓬_1RZ1_0e8"; //74608
hideonnpc "#�퓬_1RZ1_0e8"; //74608
misceffect 89, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �N�N�N�B�܂�܂ƈ���������Ƃ͋����Ȑl�����ł��ˁB�ǂ��ł����������̂ƕ��������C���́B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 330800)
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 526)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 526)
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 526)
announce "���_�A���N : ��قǂ̃����N�l�͎������o�������e�ł��B�{���̃����N�l�͌��݋x�����Ƃ��Ă��܂��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
@nomalattack(src: ""(4631724), dst: 13928, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@mob_defeated("1395:�C�G���[�N���X�^��:0e81@rev.gat"(13928))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 1008)
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 527)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 531)
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: ""(4631724), dst: 21357, damage: 1, sDelay: 260, dDelay: 0, aDelay: 530)
@mob_defeated("1397:���b�h�N���X�^��:0e81@rev.gat"(21357))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �������c�c�����܂ł��ă����N�l�ɉ�����Ƃ́B�l�Ԃł��邠�Ȃ����������N�l�܂ł��ǂ蒅����Ƃ͎v���܂��񂪁c�c�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
getitem 728, 1;
@nomalattack(src: ""(4631724), dst: 44621, damage: 1, sDelay: 260, dDelay: 440, aDelay: 3024)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
getitem 757, 1;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �����ł��傤�B���Ȃ����������N�l�ɉ���i�����邩�ǂ����A���������č����グ�܂��B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 4039)
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 523)
@nomalattack(src: ""(4631724), dst: 24499, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@mob_defeated("1398:�u���[�N���X�^��:0e81@rev.gat"(24499))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
getitem 22681, 1;
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 2394)
announce "���_�A���N : ���܂莄�����]�����Ȃ��ł���������H�@�͕s���Ɣ��f�����炱�����痧�������Ă��������܂��̂Łc�c�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 524)
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
@nomalattack(src: ""(4631724), dst: 14323, damage: 1, sDelay: 260, dDelay: 0, aDelay: 525)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("1396:�O���[���N���X�^��:0e81@rev.gat"(14323))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �����̍Ő[���ɂ��ǂ���Ȃ��悤�Ȏ҂ȂǁA�����N�l�ɉ���i�͂���܂���B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �����A���Ȃ����̗́A�����Ă��������܂��傤�I�@�N�N�N!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@spawn(type: BL_MOB, ID: 22880, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 24268, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
mes "[�L�h]";
mes "�����B�Ȃ񂾂���́B";
mes "�S��������B";
close;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 24159, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 13702, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123383851)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 648, sDelay: 824, dDelay: 400, tick: 123384775)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2627)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 7919)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2622)
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@spawn(type: BL_MOB, ID: 8419, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123394643)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 780, sDelay: 824, dDelay: 400, aDelay: 2623)
@spawn(type: BL_MOB, ID: 20721, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 28698, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 17893, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 6203)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 6455)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 661, sDelay: 824, dDelay: 400, tick: 123400954)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 4590)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2632)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : ���̕����B��I�@�����Ƌ��|�Ƌ�ɂ�^����̂ł��I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@spawn(type: BL_MOB, ID: 18829, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(17893), dst: 4631724, damage: 755, sDelay: 824, dDelay: 400, tick: 123409562)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18829), dst: 4631724, damage: 784, sDelay: 824, dDelay: 400, tick: 123410445)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2626)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(17893), dst: 4631724, damage: 831, sDelay: 824, dDelay: 400, aDelay: 2625)
@spawn(type: BL_MOB, ID: 24858, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(25, 119), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20721), dst: 4631724, damage: 865, sDelay: 824, dDelay: 400, tick: 123412292)
@spawn(type: BL_MOB, ID: 18449, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 19412, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: ""(4631724), dst: 44621, damage: 1, sDelay: 260, dDelay: 440, aDelay: 54248)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123421277)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(19412), dst: 4631724, damage: 806, sDelay: 824, dDelay: 400, tick: 123421716)
@nomalattack(src: ""(4631724), dst: 19412, damage: 77, sDelay: 260, dDelay: 440, aDelay: 1280)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@spawn(type: BL_MOB, ID: 21292, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 21378, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 21418, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 21453, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(19412), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 3652)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 4806)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 3277)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 20762)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(13702), dst: 4631724, damage: 767, sDelay: 824, dDelay: 400, aDelay: 30719)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(17893), dst: 4631724, damage: 698, sDelay: 824, dDelay: 400, aDelay: 19378)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18829), dst: 4631724, damage: 719, sDelay: 824, dDelay: 400, aDelay: 21120)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20721), dst: 4631724, damage: 666, sDelay: 824, dDelay: 400, aDelay: 19273)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 983, sDelay: 824, dDelay: 400, aDelay: 36291)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24159), dst: 4631724, damage: 961, sDelay: 824, dDelay: 400, tick: 123431565)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 801, sDelay: 824, dDelay: 400, aDelay: 30718)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28698), dst: 4631724, damage: 780, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 706, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(17893), dst: 4631724, damage: 754, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18829), dst: 4631724, damage: 744, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20721), dst: 4631724, damage: 802, sDelay: 824, dDelay: 400, aDelay: 2627)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 753, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24159), dst: 4631724, damage: 1060, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 890, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18449), dst: 4631724, damage: 1067, sDelay: 824, dDelay: 400, tick: 123434591)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28698), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24858), dst: 4631724, damage: 883, sDelay: 824, dDelay: 400, tick: 123434802)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(19412), dst: 4631724, damage: 889, sDelay: 824, dDelay: 400, aDelay: 9875)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(13702), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(17893), dst: 4631724, damage: 939, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18829), dst: 4631724, damage: 867, sDelay: 824, dDelay: 400, aDelay: 2626)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20721), dst: 4631724, damage: 689, sDelay: 824, dDelay: 400, aDelay: 2626)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 1004, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24159), dst: 4631724, damage: 811, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 750, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18449), dst: 4631724, damage: 941, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28698), dst: 4631724, damage: 880, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24858), dst: 4631724, damage: 1155, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(21418), dst: 4631724, damage: 1156, sDelay: 824, dDelay: 400, tick: 123437615)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(19412), dst: 4631724, damage: 1174, sDelay: 824, dDelay: 400, aDelay: 2624)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �܂�����Ȃ��c�c�I�@�����Ƌ��|���I�@��ɂ��I�@����킹��̂ł�!!", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(8419), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@spawn(type: BL_MOB, ID: 13524, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(13702), dst: 4631724, damage: 851, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(17893), dst: 4631724, damage: 801, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18829), dst: 4631724, damage: 801, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20721), dst: 4631724, damage: 816, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(22880), dst: 4631724, damage: 1053, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24159), dst: 4631724, damage: 820, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(24268), dst: 4631724, damage: 1001, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(21378), dst: 4631724, damage: 1038, sDelay: 824, dDelay: 400, tick: 123439527)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(18449), dst: 4631724, damage: 1048, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28698), dst: 4631724, damage: 952, sDelay: 824, dDelay: 400, aDelay: 2624)
@spawn(type: BL_MOB, ID: 12568, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(12568), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123443007)
@spawn(type: BL_MOB, ID: 12662, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(24159))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(24268))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(13702))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(20721))
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(12568), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 3883)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(28698))
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(12568), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 5500)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(22880))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(12662), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123453693)
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@spawn(type: BL_MOB, ID: 31374, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 31405, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 31590, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(25, 119), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 13295, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 31426, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(34, 111), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: ""(4631724), dst: 44621, damage: 1, sDelay: 260, dDelay: 440, aDelay: 36569)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(8419))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �N�N�N�c�c�B�����ł���B�����ƒ�R���Ȃ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@spawn(type: BL_MOB, ID: 23582, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 19592, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 20418, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(17893))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(31405), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123483259)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(31590), dst: 4631724, damage: 890, sDelay: 824, dDelay: 400, tick: 123483259)
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@nomalattack(src: ""(35795), dst: 4631724, damage: 847, sDelay: 824, dDelay: 400, tick: 123484422)
@spawn(type: BL_MOB, ID: 26054, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 26798, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20418), dst: 4631724, damage: 841, sDelay: 824, dDelay: 400, tick: 123484735)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 35795, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20418), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2855)
@spawn(type: BL_MOB, ID: 23503, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(18829))
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20418), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2629)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(19412))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(18449))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(24858))
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(13524))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123504296)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(12568))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(31590))
announce "���_�A���N : ���̌����񂾒ʂ�A�͂���҂̂悤�ł��ˁB�N�N�N�c�c�ʔ����I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@spawn(type: BL_MOB, ID: 19924, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 20383, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 5249)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(31374))
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(23503), dst: 4631724, damage: 715, sDelay: 824, dDelay: 400, tick: 123511098)
@nomalattack(src: ""(28897), dst: 4631724, damage: 951, sDelay: 824, dDelay: 400, tick: 123511204)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 840, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20383), dst: 4631724, damage: 985, sDelay: 824, dDelay: 400, tick: 123512441)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(31426))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(23582))
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 19975, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(23503), dst: 4631724, damage: 674, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(28897), dst: 4631724, damage: 845, sDelay: 824, dDelay: 400, aDelay: 2625)
@spawn(type: BL_MOB, ID: 22076, speed: 200, option: 0, view: 3003, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�A�[�`���[")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 654, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20383), dst: 4631724, damage: 936, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(23503), dst: 4631724, damage: 664, sDelay: 824, dDelay: 400, aDelay: 2625)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(31405))
@nomalattack(src: ""(28897), dst: 4631724, damage: 988, sDelay: 824, dDelay: 400, aDelay: 2624)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 928, sDelay: 824, dDelay: 400, aDelay: 2625)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20383), dst: 4631724, damage: 879, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(23503), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(28897), dst: 4631724, damage: 919, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 731, sDelay: 824, dDelay: 400, tick: 123519245)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(19592))
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 759, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 684, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20383), dst: 4631724, damage: 959, sDelay: 824, dDelay: 400, aDelay: 2625)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(20418))
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 629, sDelay: 824, dDelay: 400, aDelay: 837)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(35795))
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(23503), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2622)
@nomalattack(src: ""(28897), dst: 4631724, damage: 676, sDelay: 824, dDelay: 400, aDelay: 2623)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 851, sDelay: 824, dDelay: 400, aDelay: 840)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(13295))
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 796, sDelay: 824, dDelay: 400, aDelay: 2623)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20383), dst: 4631724, damage: 649, sDelay: 824, dDelay: 400, aDelay: 2623)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 858, sDelay: 824, dDelay: 400, aDelay: 865)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 28897, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(23503), dst: 4631724, damage: 721, sDelay: 824, dDelay: 400, aDelay: 2628)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 870, sDelay: 824, dDelay: 400, aDelay: 944)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28897), dst: 4631724, damage: 828, sDelay: 824, dDelay: 400, aDelay: 3048)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 880, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 957, sDelay: 824, dDelay: 400, aDelay: 2627)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 945)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26054), dst: 4631724, damage: 935, sDelay: 824, dDelay: 400, tick: 123526345)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20383), dst: 4631724, damage: 795, sDelay: 824, dDelay: 400, aDelay: 3511)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(23503), dst: 4631724, damage: 735, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 666, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(28897), dst: 4631724, damage: 980, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(19924), dst: 4631724, damage: 872, sDelay: 824, dDelay: 400, tick: 123527478)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 691, sDelay: 824, dDelay: 400, aDelay: 945)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26798), dst: 4631724, damage: 684, sDelay: 824, dDelay: 400, aDelay: 3529)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(26054), dst: 4631724, damage: 672, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(20383), dst: 4631724, damage: 683, sDelay: 824, dDelay: 400, aDelay: 2624)
@spawn(type: BL_MOB, ID: 19939, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(44, 125), dir: 0, name: "�����X�E�O�[��")
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2124)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
misceffect 124, "�L�h#2���_0e8"; //74597
misceffect 220, "�L�h#2���_0e8"; //74597
misceffect 368, "�L�h#2���_0e8"; //74597
misceffect 9, "#���G�t�F�N�g�p_0e8"; //74607
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123534412)
@spawn(type: BL_MOB, ID: 26184, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@spawn(type: BL_MOB, ID: 33209, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: ""(34745), dst: 4631724, damage: 775, sDelay: 824, dDelay: 400, aDelay: 841)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(26054))
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(33209), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, tick: 123536849)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 944, sDelay: 824, dDelay: 400, aDelay: 929)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 845)
@spawn(type: BL_MOB, ID: 3775, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 788, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: ""(34745), dst: 4631724, damage: 681, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: ""(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@spawn(type: BL_MOB, ID: 34745, speed: 200, option: 0, view: 3003, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�A�[�`���[")
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 946)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(3775), dst: 4631724, damage: 833, sDelay: 824, dDelay: 400, tick: 123544746)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 842)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 828)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 845)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(3775), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2613)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(3775), dst: 4631724, damage: 948, sDelay: 824, dDelay: 400, aDelay: 2626)
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(19924))
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 836, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 647, sDelay: 824, dDelay: 400, aDelay: 838)
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 927, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(3775), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2622)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 845)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 827)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 935, sDelay: 824, dDelay: 400, aDelay: 829)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 828)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 833)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 831)
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(3775), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 2633)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 838)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 840)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@nomalattack(src: "3001:�����X�E�O�[��:0e81@rev.gat"(3775), dst: 4631724, damage: 703, sDelay: 824, dDelay: 400, aDelay: 2622)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 839)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 841)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 844)
@nomalattack(src: "3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745), dst: 4631724, damage: 0, sDelay: 824, dDelay: 400, aDelay: 843)
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
@spawn(type: BL_MOB, ID: 26657, speed: 1000, option: 0, view: 3001, pos: "0e81@rev.gat"(0, 0), dir: 0, name: "�����X�E�O�[��")
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(23503))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(28897))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(26798))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(19939))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(19975))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(20383))
@mob_defeated("3003:�����X�E�A�[�`���[:0e81@rev.gat"(22076))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(33209))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(26184))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(26657))
@mob_defeated("3001:�����X�E�O�[��:0e81@rev.gat"(3775))
@mob_defeated("3003:�����X�E�A�[�`���[:0e81@rev.gat"(34745))
misceffect 74, "#��~�G�t�F�N�gRZ1_0e8"; //74599
announce "���_�A���N : �N�N�N�c�c�Ȃ��Ȃ����ԂƂ��ł��ˁI", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
announce "���_�A���N : �����c�c���܂ő����܂����ˁB�N�N�N�I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
misceffect 196, "#RZ�������A���G�t�F�N�g"; //74572
hideonnpc "#2�����ڃf�o�t_1_0e8"; //74600
hideonnpc "#2�����ڃf�o�t_2_0e8"; //74601
hideonnpc "#2�����ڃf�o�t_3_0e8"; //74602
hideonnpc "#2�����ڃf�o�t_4_0e8"; //74603
hideonnpc "#2�����ڃf�o�t_5_0e8"; //74604
hideonnpc "#2�����ڃf�o�t_6_0e8"; //74605
hideonnpc "#2�����ڃf�o�t_7_0e8"; //74606
hideoffnpc "#RZ�ړ�_5_0e8"; //76959
hideoffnpc "#RZ�ړ�_6_0e8"; //76960
hideoffnpc "#RZ�ړ�_7_0e8"; //76961
hideoffnpc "#RZ�ړ�_8_0e8"; //76962
0e81@rev.gat,28,125,0	warp	#RZ�ړ�_5_0e8	2,2,0e81@rev.gat,31,50 //76959 from_pos=(29, 124)
@changeoption(id: 4631724, opt1: 0, opt2: 0, option: 0, karma: 0)
0e81@rev.gat,34,48,0	script	#RZ�������A���G�t�F�N�g	139,{/* 74573 (hide)*/}
0e81@rev.gat,34,55,4	script	���_�A���N#RZ�C�x���g_5	3029,{/* 74586 (hide)*/}
0e81@rev.gat,34,47,0	script	#�퓬_2RZ1_0e8	139,{/* 74610 */}
0e81@rev.gat,34,47,0	script	#�퓬_2RZ1_timer_0e8	139,{/* 74611 */}
0e81@rev.gat,28,53,0	script	#RZ�ړ�_13a_0e8	45,{/* 72590 (hide)*/}
0e81@rev.gat,28,42,0	script	#RZ�ړ�_14a_0e8	45,{/* 72591 (hide)*/}
0e81@rev.gat,39,42,0	script	#RZ�ړ�_15a_0e8	45,{/* 76965 (hide)*/}
0e81@rev.gat,39,53,0	script	#RZ�ړ�_16a_0e8	45,{/* 76966 (hide)*/}
0e81@rev.gat,28,53,0	script	#RZ�ړ�_13_0e8	45,{/* 76967 (hide)*/}
0e81@rev.gat,28,42,0	script	#RZ�ړ�_14_0e8	45,{/* 76968 (hide)*/}
0e81@rev.gat,39,42,0	script	#RZ�ړ�_15_0e8	45,{/* 76969 (hide)*/}
0e81@rev.gat,39,53,0	script	#RZ�ړ�_16_0e8	45,{/* 76970 (hide)*/}
