1_tiamat_00.gat,0,0,0	script	#tiamat_start	139,{
OnInit:
	initnpctimer;
	end;
OnStart:
OnTimer5000:
//OnClock:
//	initnpctimer;
	set $@tiamat_main,0;
	set $@tiamat_milka,0;
	set $@tiamat_hound,0;
	set $@tiamat_lowen,0;
	donpcevent "#tiamat_inital::OnStart";
	donpcevent "#tiamat_setwall::OnStart";
	donpcevent "tiamat_mob#all::OnStart";
	announce "�e�B�A�}�g�U��킪�J�n����܂����B�Q���������́u�v�����e���[��(��n[1]�`[5])�v�ɂ��W�܂肭�������B", 0;
	end;
OnTimer10000:
	announce "40�b��ɉ���̒��S���ւ̓����J����܂�", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer20000:
	announce "30�b��ɉ���̒��S���ւ̓����J����܂�", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer25000:
	announce "�������A : �����͂�낵���ł����B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer30000:
	announce "�������A : ���̗͂��g���ĉ���ɒ����Ă��錋�E�̈ꕔ�������������q���܂��B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer35000:
	announce "�������A : �������牤��֌������܂��傤�B", 0x9, 0x00ff00, 0x190, 26, 0, 0;
	end;
OnTimer40000:
	announce "10�b��ɉ������A������̒��S���ւ̓����J���܂�", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer45000:
	announce "5�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer46000:
	announce "4�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	hideonnpc "area00#r01"; //54
	misceffect 58, "�������A#1_tiamat_00"; //55
	end;
OnTimer47000:
	announce "3�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 222, "area00#r01"; //54
	end;
OnTimer48000:
	announce "2�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnTimer49000:
	announce "1�c�c", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	misceffect 488, "area00#r01"; //54
	end;
OnTimer50000:
	stopnpctimer;
	announce "����ւ̓����J���ꂽ", 0x9, 0x00ebff, 0x190, 30, 0, 0;
	set $@tiamat_main,1;
	donpcevent "tiamat_mob#r14::OnStart";
	hideonnpc "�������#0B"; //64
	hideonnpc "�������#0C"; //65
	hideonnpc "�������#0D"; //66
	hideoffnpc "�������#0A"; //63
	misceffect 321, "area00#r01"; //54
	hideoffnpc "area00#r01"; //54
	end;
OnMilka:
	announce "�l�R�m�~���J�����̕����ɐi�݂܂���", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnHound:
	announce "�l�R�m�n�E���h�����̕����ɐi�݂܂���", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
OnLowen:
	announce "�l�R�m���[�E�F�������̕����ɐi�݂܂���", 0x9, 0x00ebff, 0x190, 20, 0, 0;
	end;
}

1_tiamat_00.gat,195,172,3	script	�������A#1_tiamat_00	10361,{/* 55 */
	if($@tiamat_main == 0) {
		mes "[�������A]";
		mes "���҂����Ă���܂����B";
		mes "����������֑������ł��B";
	}
	else if($@tiamat_main) {
		mes "[�������A]";
		mes "����ւ̓��͊J����Ă��܂��B";
		mes "�C���������߂ĎQ��܂��傤�B";
	}
	else if($@tiamat_main) {
		mes "[�������A]";
		mes "���悢�斂���Ƃ̌���ł��B";
		mes "�ǂ����A�䕐�^���c�c�B";
	}
	else if($@tiamat_main) {
		mes "[�������A]";
		mes "�c�c���ꂪ�Ō�̐킢�ƂȂ�ł��傤�B";
		mes "�S�Ă��c�c�M���ɑ����܂��B";
	}
	else if($@tiamat_main) {
		unittalk "�������A : �����͂��肪�Ƃ��������܂����B�T���̐��ʂ�閧�̕����ɂĊm�F���܂��傤�B",1;
		end;
	}
	while(1) {
		next;
		if(select("�T���̊�{�ɂ��ĕ���","��߂�") == 2) {
			mes "[�������A]";
			mes "�������܂�܂����B";
			mes "������p������܂�����";
			mes "���ł������|�����������B";
			close;
		}
		mes "[�������A]";
		mes "�T���̊�{�ɂ��Ăł��ˁB";
		next;
		mes "[�������A]";
		mes "�T���̍ŏI�ڕW��";
		mes "����̉������ɂ���";
		mes "^009eff�����W�����g^000000�������o���A";
		mes "^009eff���S�ɖłڂ�^000000���Ƃł��B";
		next;
		mes "[�������A]";
		mes "������̊e������";
		mes "�����ɂ���Đ��ݏo���ꂽ";
		mes "�����X�^�[�ɂ����";
		mes "���E�������Ă��܂��B";
		next;
		mes "[�������A]";
		mes "���̂��߁A���ւƐi�ނɂ�";
		mes "^009eff�e�����ɂ���S�Ẵ����X�^�[��^000000";
		mes "^009eff�|���K�v������ł��傤�B^000000";
		next;
		mes "[�������A]";
		mes "�܂��A���E�ȊO�ɂ����̗͂ɂ����";
		mes "����������Ă���ꍇ������܂��B";
		next;
		mes "[�������A]";
		mes "����Ȏ��́A�ʂ̓����s����";
		mes "�����J�����߂̎d�|����";
		mes "�T���Ă݂�̂��ǂ���������܂���B";
		next;
		mes "[�������A]";
		mes "���ɉ�����������";
		mes "�Ȃ肽�����Ƃ͂������܂����H";
		continue;
	}
}
1_tiamat_00.gat,197,170,3	script	���{���Ïp�m#1_tiamat_0	641,{/* 56 */
	mes "[���{���Ïp�m]";
	mes "�̗́A�C�͂̉񕜁A";
	mes "��Ԉُ�̉����A";
	mes "��ꂽ�A�C�e���̏C����";
	mes "�����Ē����܂����B";
	mes "�q�ɂ͂����p�ɂȂ��܂����H";
	npcskillsupport 28,9999,"���{���Ïp�m#1_tiamat_0";//�q�[��
	misceffect 7,"";
	misceffect 14,"";
	misceffect 492,"";
	percentheal 100,100;
	next;
	switch(select("��������","�q��")) {
	case 1:
		mes "[���{���Ïp�m]";
		mes "���A�l�̂��Ƃ𗊂݂܂��B";
		mes "�����ċA���Ă��Ă��������ˁc�c�B";
		close;
	case 2:
		//
		mes "[���{���Ïp�m]";
		mes "���A�l�̂��Ƃ𗊂݂܂��B";
		close2;
		openstorage;
		end;
	}
}
1_tiamat_00.gat,194,151,3	script	�X���B�G#1_tiamat_00	10274,{/* 57 */
	unittalk "�X���B�G : �K�����c�c�B",1;
	end;
}
1_tiamat_00.gat,190,153,3	script	���s�߉q��#1_tiamat_00	418,{/* 58 */
	mes "[���s�߉q��]";
	mes "���A�l�͖k�ɂ���";
	mes "����̖�̑O�ł��҂��ł��B";
	next;
	if(select("�b����߂�","��n�֋A��") == 1) {
		mes "[���s�߉q��]";
		mes "�킩��܂����B";
		mes "�܂������������������B";
		close;
	}
	mes "[���s�߉q��]";
	mes "�������܂�܂����B";
	mes "�ł́A��n�ɖ߂�܂��傤�B";
	close2;
	misceffect 316,"";
	misceffect 317,"";
	warp "pab_base01.gat",338,75;
	end;
}
1_tiamat_00.gat,198,173,3	script	�ٌ`�̖��l#1_tiamat_00	661,{/* 59 */
	mes "[�ٌ`�̖��l]";
	mes "�M�����]�܂��̂Ȃ�";
	mes "^0000ff�O�x�܂�^000000����ō�풆�̑���";
	mes "�]�����Ă����グ�܂��傤�B";
	mes "^0000ff�c��]���� : 3^000000";
	next;
	switch(select("��߂�","�~���J��","�n�E���h��","���[�E�F����")) {
	default:
		mes "[�ٌ`�̖��l]";
		mes "���l�ł����B";
		mes "�C���ς������܂����z�����������B";
		mes "���̗͈͓͂̔��ł����";
		mes "�肢�������܂��傤�B";
		close;
	}
}
1_tiamat_00.gat,188,171,4	script	�l�R�m�~���J#ex001	728,{/* 60 (hide)*/
	mes "[�l�R�m�~���J]";
	mes "�˓��̏����͗ǂ��H";
	mes "���̐i�s���[�g��";
	mes "^0000ff���͂ȃ����X�^�[^000000�Ƃ�";
	mes "�������킢�ɂȂ�Ǝv����B";
	mes "�r�Ɏ��M������̂Ȃ�A���ɂ��ė��āB";
	close;
}
1_tiamat_00.gat,189,173,4	script	�l�R�m�n�E���h#ex001	420,{/* 61 (hide)*/
	mes "[�l�R�m�n�E���h]";
	mes "�����ɗ���̂��v���Ԃ肾�ȁB";
	mes "���l�̐i�s���[�g��";
	mes "^0000ff�����U���������ɂ��������X�^�[^000000�Ƃ�";
	mes "�o�g�����҂��Ă邺�B";
	mes "���@�U���Ɏ��M������z���A";
	mes "���l�̕����ɓ����Ă���B";
	close;
}
1_tiamat_00.gat,186,172,4	script	�l�R�m���[�E�F��#ex001	416,{/* 62 (hide)*/
	mes "[�l�R�m���[�E�F��]";
	mes "�����͊��ӂ������܂��A�`���ғa�B";
	mes "���̐i�s���[�g��";
	mes "^0000ff���@�U���������ɂ��������X�^�[^000000�Ƃ�";
	mes "�A��ɂȂ���̂Ƒz�肳��܂��B";
	mes "�����U���Ɏ��M��������ł�����";
	mes "���̑��ɂ��͂����݂����������B";
	close;
}
