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
	mes "�]�Ԃ��Ԃ�����]";
	next;
	if(select("�Ԃ��Ԃɓ���","�Ԃ��Ԃɓ���Ȃ�") == 2) {
		mes "�]���̏����ɂ����]";
		close;
	}
	switch(mdenter("mors")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[mors] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x1,0x00ff99,0x190,12,0,0;
		setquest 9319; //state=1
		setquest 9318; //state=1
		close2;
		warp "1@rev.gat",26,181;
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

1@rev.gat,27,181,0	script	#RZ�������A���X�^�[�g	139,{/* 75055 (hide)*/}
1@rev.gat,34,120,0	script	#RZ�������A���G�t�F�N�g	139,{/* 75056 (hide)*/}
1@rev.gat,34,48,0	script	#RZ�������A���G�t�F�N�g	139,{/* 75057 (hide)*/}
1@rev.gat,31,181,0	script	#RZ�C�x���g_1	139,{/* 75058 (hide)*/}
1@rev.gat,31,181,0	script	#RZ�C�x���g_1-2	139,{/* 75059 */}
1@rev.gat,20,181,0	script	#�����X�����X�^�[�g	139,{/* 75060 */}
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
1@rev.gat,104,176,0	script	#RZ�C�x���g_3	139,{/* 75075 (hide)*/}
1@rev.gat,102,180,5	script	�������C�O���h#�����N	751,{/* 75076 */}
1@rev.gat,102,180,5	script	�L�h#�����N�O	884,{/* 75077 (hide)*/}
1@rev.gat,102,180,5	script	�q�V�G#�����N�O	623,{/* 75078 (hide)*/}
1@rev.gat,111,178,4	script	�����N??#RZ1	1916,{/* 75079 */}
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
1@rev.gat,35,119,0	script	#�퓬_1RZ1	139,{/* 75092 (hide)*/}
1@rev.gat,35,119,0	script	#�퓬_1RZ1_timer	139,{/* 75093 */}
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
