@spawn(type: BL_MOB, ID: 40236, speed: 200, option: 0, view: 2998, pos: "0qj1@rev.gat"(0, 0), dir: 0, name: "�����N??")
@nomalattack(src: "2998:�����N??:0qj1@rev.gat"(40236), dst: , damage: 0, sDelay: 824, dDelay: 400, aDelay: 2625)
@nomalattack(src: ""(), dst: 40236, damage: 64, sDelay: 260, dDelay: 440, tick: 432013023)

@spawn(type: BL_MOB, ID: 23072, speed: 195, option: 0, view: 3007, pos: "0qj1@rev.gat"(34, 121), dir: 0, name: "�C�O���h�̍�")

moro_cav.gat,61,69,3	script	��C�ǐՑ���#a1	730,{/* 65381 */
	if(checkquest(201725)) {	// �����X�N���A�ς�
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
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		next;
		mes "[��C�ǐՑ���]";
		mes "�Ԃ��Ԃ֒ʂ��铹�͎����J���Ă��܂��B";
		mes "�����A��ɐi�ނ悤�ł�����";
		mes "�p�[�e�B�[���[�_�[�̕���";
		mes "���ɘb��������悤�A�`���Ă��������B";
		close;
	}
	mes "�ł͐Ԃ��Ԃɓ����Ă݂܂����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[��C�ǐՑ���]";
		mes "�C���ς������";
		mes "�܂��K�˂ė��ĉ������I";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[��C�ǐՑ���]";
		mes "�܂��Ԃ��Ԃ�";
		mes "��������";
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
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
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
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
	set '@dummy,sleep2(2000);
	announce "�����N : �N���H�@���̋x���̎ז�������̂́B", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	set '@dummy,sleep2(2000);
	announce "�]�ǂ�����Ƃ��Ȃ���������B�ǂ���炱���������N�̐�����ŊԈႢ�Ȃ��悤���]", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	set '@dummy,sleep2(4000);
	announce "�H�H�H : �҂��Ă���I", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	set '@dummy,sleep2(2000);
	misceffect 60,""; //self
	hideonnpc "#RZ�C�x���g_1"; //70780
	hideoffnpc "#RZ�C�x���g_1-2"; //70781
	end;
}
1@rev.gat,31,181,0	script	#RZ�C�x���g_1-2	139,5,5,{/* 75059 */
OnTouch:
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		end;
	mes "�]������琺����������H";
	mes "�@�N�������̂��낤���]";
	next;
	set 'menu,select(
		(ASH_6QUE == 14 || ASH_6QUE == 15? "�C�O���h": "�H�H�H"),
		(ASH_5QUE >= 31? "�L�h": "�H�H�H"),
		(ECL_3QUE >= 33? "�q�V�G": "�H�H�H"),
		"�N�����Ȃ�");
	hideonnpc "#RZ�C�x���g_1"; //70780
	switch('menu) {
	case 1:
		if(ASH_6QUE < 14 || ASH_6QUE > 15) {
			mes "�]�������������C���������A";
			mes "�@�C�̂����������悤���]";
			mes "�]^ff0000�O�����ւ̕񍐏��N�G�X�g^000000��";
			mes "�@�N���A���Ă��Ȃ�����";
			mes "�@���Ԃ͂������܂���ł����]";
			donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
			close;
		}
		hideoffnpc "�������C�O���h#����"; //70783
		break;
	case 2:
		if(ASH_5QUE < 31) {
			mes "�]�������������C���������A";
			mes "�@�C�̂����������悤���]";
			mes "�]^ff0000���������N�ǐՃN�G�X�g^000000��";
			mes "�@�N���A���Ă��Ȃ�����";
			mes "�@���Ԃ͂������܂���ł����]";
			donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
			close;
		}
		hideoffnpc "�L�h#����"; //70783
		break;
	case 3:
		if(ECL_3QUE < 33) {
			mes "�]�������������C���������A";
			mes "�@�C�̂����������悤���]";
			mes "�]^ff0000�G�N���[�W���̉��N�G�X�g^000000��";
			mes "�@�N���A���Ă��Ȃ�����";
			mes "�@���Ԃ͂������܂���ł����]";
			donpcevent getmdnpcname("#�����X�����X�^�[�g")+ "::OnStart";
			close;
		}
		hideoffnpc "�q�V�G#����"; //70783
		break;
	}
	mes "�]���Ԃ���������-";
	close;
OnStart:
	announce "���_�A���N : �܂���܂����ˁB", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	sleep 3000;
	if('menu == 1) {
		announce "�C�O���h : �����N�͂ǂ����I", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 3000;
	}
	else if('menu == 2) {
		announce "�L�h : �����N�͂ǂ��ɂ���H", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 3000;
	}
	else if('menu == 3) {
		announce "�q�V�G : �����N�͂ǂ����H", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 3000;
	}
	announce "���_�A���N : ����ȂɃ����N�l�ɉ�����ł����H�@�N�N�N�B", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	sleep 3000;
	announce "���_�A���N : �����̓����N�l�������g�̐��_�Ŏx�z����Ă����ԁB", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	sleep 3000;
	announce "���_�A���N : �����A���ׂĂ������N�l�̐��E�ł��B", 0x9, 0x00ebff, 0x190, 12, 0, 0;
	sleep 3000;
	if('menu == 1) {
		announce "�C�O���h : �Ȃ񂾂ƁI", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 3000;
	}
	else if('menu == 2) {
		announce "�L�h : �ق��B", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 3000;
	}
	else if('menu == 3) {
		announce "�q�V�G : �ӂށB", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 3000;
	}
	announce "���_�A���N : ���Ȃ����̎v���ʂ�ɂ͂����Ȃ��ł��傤�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	sleep 3000;
	announce "���_�A���N : ���������N�l�����҂��ł��B�����N�l������ꏊ�܂ňē����܂��傤�B", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	sleep 3000;
	hideonnpc "���_�A���N#RZ�C�x���g_2"; //69673
	sleep 3000;
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
	mes "�G�����邼�I";
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
1@rev.gat,25,183,5	script	�q�V�G#����	623,{/* 75063 (hide)*/
	mes "[�q�V�G]";
	mes "�G�����Ă��邼�I";
	mes "���ӂ���I";
	close;
OnStart:
	initnpctimer;
	end;
OnTimer100:
	unittalk "�q�V�G : �Ԃɍ��������B";
	end;
OnTimer3100:
	donpcevent "#�����X�����X�^�[�g::OnStart";
	unittalk "�q�V�G : ���낻��J���̖��͂��S�z�Ȃ񂾁B�}���K�v������B�����ꏏ�ɍs�����Ă���B";
	end;
OnTimer6100:
	stopnpctimer;
	unittalk "�q�V�G : �G�����Ă���ȁB���f����Ȃ�I";
	end;
}
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
1@rev.gat,60,184,5	script	�q�V�G#������	623,{/* 75066 (hide)*/
	mes "[�q�V�G]";
	mes "���̂̂���Ȃ��z���B�C��t���悤�B";
	close;
}
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
OnTouch:
	initnpctimer;
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	hideonnpc "#RZ�C�x���g_3"; //69840
	hideoffnpc "�������C�O���h#�����N"; //69841
	hideoffnpc "�����N??#RZ1"; //69725
	unittalk getcharid(3),strcharinfo(0)+ " : �����N!?";
	set '@dummy,sleep2(2500);
	if('menu==0)
		unittalk getcharid(3),strcharinfo(0)+ " : ���������c�c���ꂾ���T�d�ȃ����N������Ȃɂ������茩����Ƃ́B";
	else if('menu==1)
		npctalk "�C�O���h : ���������c�c���ꂾ���T�d�ȃ����N������Ȃɂ������茩����Ƃ́B",getmdnpcname("�������C�O���h#�����N");
	else if('menu==2)
		npctalk "�L�h : ���������c�c���ꂾ���T�d�ȃ����N������Ȃɂ������茩����Ƃ́B",getmdnpcname("�L�h#�����N�O");
	set '@dummy,sleep2(3000);
	if('menu==0)
		unittalk getcharid(3),strcharinfo(0)+ " : �c�c�{���Ƀ����N��!?";
	else if('menu==1)
		npctalk "�C�O���h : �c�c�{���Ƀ����N��!?",getmdnpcname("�������C�O���h#�����N");
	else if('menu==2)
		npctalk "�L�h : �c�c�{���Ƀ����N��!?",getmdnpcname("�L�h#�����N�O");
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
	hideoffnpc "�����N??#RZ1"; //69725
	if('menu==1)
		hideoffnpc "�������C�O���h#�����N"; //69841
	else if('menu==2)
		hideoffnpc getmdnpcname("�L�h#�����N�O"); //69841
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk6";
	sleep 2500;
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk7";
	sleep 2500;
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk8";
	sleep 3000;
	donpcevent getmdnpcname("�����N??#RZ1")+ "::OnTalk9";
	hideoffnpc "�����N??#RZ1"; //69725
	sleep 3000;
	if('menu==0) {
		announce "�������I�@�ǂ������悤!!", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 3000;
	}
	else if('menu==1) {
		npctalk "�C�O���h : �����I�@�҂āI�@�����₪�����ȁI",getmdnpcname("�������C�O���h#�����N");
		sleep 3000;
		npctalk "�C�O���h : �}���Œǂ������邼�B������ɍs�����B",getmdnpcname("�������C�O���h#�����N");
		sleep 3000;
		hideonnpc getmdnpcname("�������C�O���h#�����N"); //69841
		sleep 6000;
		announce "�C�O���h : ���A���킟���I�@�Ȃ񂾂���́c�c�B", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 2000;
	}
	else if('menu==2) {
		npctalk "�L�h : �����A�����₪�������B�������c�c�D�ɗ�����ȁB",getmdnpcname("�L�h#�����N�O");
		sleep 3000;
		npctalk "�L�h : �d���Ȃ��A�ǂ������悤�B��ɍs���B",getmdnpcname("�L�h#�����N�O");
		sleep 3000;
		hideonnpc getmdnpcname("�L�h#�����N�O"); //69841
		sleep 6000;
		announce "�L�h : �Ȃ񂾂����!!�@�����c�c�I", 0x9, 0x00ebff, 0x190, 12, 0, 0;
		sleep 2000;
	}
	hideoffnpc "#RZ�ړ�_1"; //69551
	hideoffnpc "#RZ�ړ�_2"; //69552
	hideoffnpc "#RZ�ړ�_3"; //69553
	hideoffnpc "#RZ�ړ�_4"; //69554
	donpcevent getmdnpcname("#���G�t�F�N�g�p")+ "::OnStart";
	end;
}
1@rev.gat,102,180,5	script	�������C�O���h#�����N	751,{/* 75076 */
	mes "[�C�O���h]";
	mes "�C��t����I";
	mes "���̃����N������Ȃɂ�������";
	mes "������Ƃ͎v���Ȃ��B";
	close;
}
1@rev.gat,102,180,5	script	�L�h#�����N�O	884,{/* 75077 (hide)*/
	mes "[�L�h]";
	mes "�C��t����I";
	mes "���̃����N������Ȃɂ�������";
	mes "������Ƃ͎v���Ȃ��B";
	close;
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
1@rev.gat,34,120,0	script	#���G�t�F�N�g�p	139,{/* 75091 */
OnStart:
	end;
}
1@rev.gat,35,119,0	script	#�퓬_1RZ1	139,2,2,{/* 75092 (hide)*/
	set 'menu,getvariableofnpc('menu, getmdnpcname("#RZ�C�x���g_1-2"));
	hideonnpc getmdnpcname("#�퓬_1RZ1"); //69796
	if('menu==0)
		set '@name$,strcharinfo(0)+ "�̍�";
	else if('menu==1)
		set '@name$,"�C�O���h�̍�";
	else if('menu==2)
		set '@name$,"�L�h�̍�";
	monster getmdmapname("1@rev.gat"),34,120,'@name$,3007,1,getmdnpcname("#�퓬_1RZ1")+ "::OnKilled1";
	donpcevent getmdnpcname("#�퓬_1RZ1_timer")+ "::OnStart";
	end;
OnStart:
	initnpctimer;
	end;
OnSpawn:
	set '@map$,getmdmapname("1@rev.gat");
	set '@label$,getmdnpcname("#�퓬_1RZ1")+ "::OnKilled2";
	monster '@map$,38,180,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,181,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,38,182,"�����X�E�O�[��",3001,1,'@label$;
	monster '@map$,54,180,"�����X�E�O�[��",3001,1,'@label$;
	if('menu==1) {
		misceffect 124, "�������C�O���h#2���"; //69726
		misceffect 220, "�������C�O���h#2���"; //69726
		misceffect 368, "�������C�O���h#2���"; //69726
	}
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
