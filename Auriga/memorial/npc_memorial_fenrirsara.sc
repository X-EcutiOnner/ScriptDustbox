dali02.gat,97,142,3	script	�o�[���n�[�h���m#a1	865,{/* 51020 */
	if(checkquest(120165)&8 == 0) {
		mes "[�o�[���n�[�h���m]";
		mes "���̓V���o���c�o���h�ō���";
		mes "���팤�������Ă���A";
		mes "�o�[���n�[�h�Ƃ����҂��B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "�I���Ȃ������̖���";
		mes "�����̕�������グ�Ă������A";
		mes "�܂�����������Ȃ��C�����Ă����B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "����Ȓ��A����";
		mes "�Ï��ɋL���ꂽ����̌�����";
		mes "�i�߂Ă������A";
		mes "���̏ꏊ�ɂ��鎟���̋��Ԃ�";
		mes "���݂�m�����B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "�����āA����ɋ��͂ŁA";
		mes "�D�ꂽ����𑢂邽�߂ɂ́A";
		mes "�ߋ��ɋP��������̈╨��";
		mes "�K�v���ƌ���������m�����̂��B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "���͂ȕ�������グ�邽�߂ɂ́A";
		mes "�����ߋ��A����ȗ͂�������";
		mes "2�l�̖����m�̌������퓬��";
		mes "���ꂽ�Ƃ���^ff0000�M�K���e�X�̔j��^000000";
		mes "�Ƃ����������K�v���B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "���������́A";
		mes "���̏ꏊ�𗣂���ɂ͂����Ȃ��B";
		mes "����ɁA���̂悤�Ȕ�͂ȉȊw�҂�";
		mes "�����m�����̌������퓬�̏�֍s���Ă�";
		mes "�����ł��Ȃ����낤�B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "�����Ă��̃M�K���e�X�̔j�Ёc�c";
		mes "���̔j�Ђ���z������ɁA";
		mes "�M�K���e�X���傫���A";
		mes "�������̂ł������ɈႢ�Ȃ��B";
		mes "���̂悤�Ȏ҂̗͂ł�";
		mes "����G��Ȃ����낤�B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "�����Ŏ��́A���̑����";
		mes "�j�Ђ��W�߂Ă����";
		mes "�E�҂�T���Ă���̂��B";
		mes "�N�����ɋ��͂��Ă�����";
		mes "�������̂����c�c�B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "�ǂ����H";
		mes "�ߋ��ɍs���A�M�K���e�X�̔j�Ђ�";
		mes "�T���o���Ă��Ă͂���Ȃ����H";
		mes "�������A��V�͒e�ނ��B";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�o�[���n�[�h���m]";
			mes "�C���ς������";
			mes "�܂��K�˂ė��Ă���B";
			close;
		}
		mes "[�o�[���n�[�h���m]";
		mes "�������A�����󂯂Ă���邩�I";
		mes "���肪�Ƃ��A�{���ɏ������B";
		next;
		mes "[�o�[���n�[�h���m]";
		mes "����ł́A�t�F�������ƃT��������";
		mes "�ߋ��̃O���X�g�w�C���ɍs������";
		mes "���ɘb�������Ă���B";
		mes "��낵�����ށB";
		setquest 120165; //state=1
		compquest 120165;
		close;
	}
	if(checkquest(9337)) {
		{
			mes "[�o�[���n�[�h���m]";
			mes "�����A�N���B";
			mes "�ߋ��̃O���X�g�w�C����";
			mes "�댯�ȏ󋵂��������낤�H";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "��`���Ă��ꂽ�����";
			mes "���̔������s�A�X��";
			mes "�ǂ��炩���󂯎���Ă���B";
			next;
			mes "�]^ff0000�q�[���s�A�X";
			mes "�@�q�[��Lv1�g�p�\^000000�]";
			mes "�@";
			mes "�]^5500ff�e���|�[�g�s�A�X";
			mes "�@�e���|�[�gLv1�g�p�\^000000�]";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "���̃s�A�X�͎��̏��肪";
			mes "^ff0000�M�K���e�X�̔j��^000000��";
			mes "���������Ă���B";
			mes "����ɗ��߂�";
			mes "�����ŃG���`�����g���\���B";
			mes "�����Ɩ��ɗ����낤�B";
			next;
			switch(select("^ff0000�q�[���s�A�X^000000��Ⴄ","^5500ff�e���|�[�g�s�A�X^000000��Ⴄ","��b����߂�")) {
			case 1:
				set '@itemid,28384;
				break;
			case 2:
				set '@itemid,28385;
				break;
			case 3:
				//
				close;
			}
			mes "[�o�[���n�[�h���m]";
			mes "�M�K���e�X�̔j�Ђ�";
			mes "������Α����قǏ�����B";
			mes "��������W�߂Ă��ė~�����B";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "�����������ړ��@��";
			mes "�G�l���M�[�[�U�ɂ͎��Ԃ�������B";
			mes "���΂炭���Ă���܂����Ă���B";
		}
		else {
			mes "[�o�[���n�[�h���m]";
			mes "�����A�N���B";
			mes "�ߋ��̃O���X�g�w�C���͂ǂ����������H";
			mes "�댯�ȏ󋵂��������낤�H";
			mes "����J�������B";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "����ŁA";
			mes "�M�K���e�X�̔j�Ђ͌����������H";
			mes "�����A���Ă��Ă͂��ꂽ�̂��H";
			mes "�j�Ђ���ɓ���鎖���o�����̂ł����";
			mes "��������ɏ����Ăق����B";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "�N���܂�������`���Ă���āA";
			mes "�M�K���e�X�̔j�Ђ�";
			mes "�W�߂Ă����̂ł���΁A";
			mes "����ɑ�������";
			mes "�G���`�����g��t����悤";
			mes "���̏���Ɍ����Ă������B";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "�M�K���e�X�̔j�Ђ�";
			mes "������Α����قǏ�����B";
			mes "��������W�߂�";
			mes "�ނ̌���K���Ƃ����B";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "�N�����ǂ�������";
			mes "�܂������ɋ��͂��ė~�����B";
			mes "�����������ړ��@��";
			mes "�G�l���M�[�[�U�ɂ͎��Ԃ�������B";
			mes "���΂炭���Ă���܂����Ă���B";
		}
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]^ff0000���ꂵ�Ă���1��ڂ̌ߑO5���ȍ~^000000";
		mes "�@����";
		mes "�@^ff0000�Ō�̓��ꂩ��1���Ԍo�ߌ�^000000";
		mes "�@�ɍēx����\�ɂȂ�܂��]";
		delquest 9337;
		setquest 9337; //state=1
		delquest 9337;
		if('@itemid)
			getitem '@itemid, 1;
		close;
	}
	if(checkquest(9336)) {
		if(checkquest(9336)&2 && checkquest(120195)&2) {
			mes "[�o�[���n�[�h���m]";
			mes "�����ړ��@�̃G�l���M�[�[�U��";
			mes "���������悤���B";
			mes "����ŉߋ��̃O���X�g�w�C����";
			mes "�ړ����邱�Ƃ��\�ɂȂ����B";
			next;
			mes "[�o�[���n�[�h���m]";
			mes "���͂ȕ�������グ�邽�߂ɂ́A";
			mes "�M�K���e�X�̔j�ЂƂ����������K�v���B";
			mes "������x�ߋ��ɍs����";
			mes "�M�K���e�X�̔j�Ђ�";
			mes "�T���o���Ă��Ă���邩�H";
			mes "�������A��V�͒e�ނ��B";
			delquest 9336;
			delquest 120195;
			setquest 120155; //state=1
			compquest 120155;
			close;
		}
		mes "[�o�[���n�[�h���m]";
		mes "�����̋��Ԃ��J���ɂ�";
		mes "�����̃G�l���M�[���K�v�ɂȂ邩��A";
		mes "���΂炭�͋x��ł��Ă���B";
		next;
		mes "[�C���t�H���[�V����]";
		mes "�]^ff0000���ꂵ�Ă���1��ڂ̌ߑO5���ȍ~^000000";
		mes "�@����";
		mes "�@^ff0000�Ō�̓��ꂩ��1���Ԍo�ߌ�^000000";
		mes "�@�ɍēx����\�ɂȂ�܂��]";
		close;
	}
	mes "[�o�[���n�[�h���m]";
	mes "�ߋ��̃O���X�g�w�C���ɍs��";
	mes "�����͏o�����̂��H";
	mes "�����炪�悯���";
	mes "�����̋��Ԃ��J�����B";
	next;
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�o�[���n�[�h���m]";
		mes "�����ƁA���܂Ȃ��B";
		mes "�����ړ��@���쓮���������Ȃ�";
		mes "^ff0000�p�[�e�B�[�̃��[�_�[^000000��";
		mes "���ɘb�����Ă���B";
		close;
	}
	if(select("�͂�","������") == 2) {
		mes "[�o�[���n�[�h���m]";
		mes "�C���ς������";
		mes "�܂��K�˂ė��Ă���B";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�o�[���n�[�h���m]";
		mes "�܂������ړ��@��";
		mes "�쓮�ł��Ă��Ȃ��B";
		mes "�����҂��Ă���B";
		close;
	}
	mdcreate "glast_sara";
	mes "[�o�[���n�[�h���m]";
	mes "�����A�t�F�������ƃT�������������";
	mes "�ߋ��̃O���X�g�w�C���ɍs����悤�A";
	mes "�����ړ��@���쓮�����Ă������B";
	mes "������֍s���鎞�Ԃ͒����Ȃ��B";
	mes "�����J������A�}���Ō������Ă���B";
	close;
OnInit:
	waitingroom "�t�F�������ƃT��",0; //51020
	end;
}

dali02.gat,93,146,6	script	����#a1	851,{/* 51021 */
OnInit:
	waitingroom "�����E�G���`�����g", 20; //51021
	end;
}

dali02.gat,99,148,3	script	�����ړ��@#XX1	10007,{/* 51022 */
	mes "�]�t�F�������ƃT����";
	mes "�@�������퓬���s����";
	mes "�@�ߋ��̃O���X�g�w�C���ւƑ���";
	mes "�@�����ړ��@���]";
	next;
	if(select("�����̋��Ԃɓ���","�����̋��Ԃɓ���Ȃ�") == 2) {
		mes "�]���Ȃ��͎����ړ��@���痣�ꂽ�]";
		close;
	}
	switch(mdenter("glast_sara")) {
	case 0:	// �G���[�Ȃ�
		announce "�������A���_���W����[glast_sara] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
		setquest 9336; //state=1
		setquest 120195; //state=1
			setquest 120160; //state=1	2�T��
			delquest 120160;
		close2;
		//warp "1@glast.gat",367,304;
		end;
	case 1:	// �p�[�e�B�[������
		mes "�]�p�[�e�B�[���[�_�[��";
		mes "�@�������A���_���W������";
		mes "�@���������p�[�e�B�[�̃����o�[�̂݁A";
		mes "�@�������A���_���W�����ɓ���܂��]";
		close;
	case 2:	// �_���W�������쐬
		mes "�]�������A���_���W����";
		mes "�@glast_sara�����݂��܂���B";
		mes "�@�p�[�e�B�[���[�_�[��";
		mes "�@�������A���_���W������";
		mes "�@�������Ă��Ȃ���Ԃł��]";
		close;
	default:	// ���̑��G���[
		close;
	}
}

1@glast.gat,359,294,4	script	�t�F������#glast_01	664,{/* 68034 */
	mes "�]����������]";
	next;
	if(select("^0000FF��b�𑁂߂�(�V���[�g�J�b�g)^000000","^FF0000�����ɘb��������^000000") == 1) {
	}
	initnpctimer;
	close;
OnTimer1000:
	unittalk "�t�F������ : !?�@���Ȃ��́c�c�H";
	end;
OnTimer1000:
	unittalk "�t�F������ : �c�c�G�A�ł͂Ȃ��悤�ˁB";
	end;
OnTimer1000:
	unittalk "�t�F������ : ���́A�t�F�����X�E�t�F�������B";
	end;
OnTimer1000:
	unittalk "�t�F������ : ���Ȃ��͂����ŉ������Ă���́H�����͊댯�ȏꏊ��B";
	end;
OnTimer1000:
	unittalk "�t�F������ : �c�c!!";
	end;
OnTimer1000:
	unittalk "�t�F������ : �C��t���āI�@�����X�^�[���P���Ă�����!!";
	end;
OnTimer1000:
	misceffect 60, "�t�F������#glast_01"; //68034
	end;
OnTimer1000:
	@spawn(type: BL_MOB, ID: 38562, speed: 150, option: 0, view: 3198, pos: "1@glast.gat"(355, 294), dir: 0, name: "�����ȃK���I��")
	end;
OnTimer1000:
	unittalk "�t�F������ : �������Ԃ��҂��ŁI�@���̖��@�œ|����I";
	end;
OnTimer1000:
	unittalk "�t�F������ : �^�Ȃ�V�̓{���c�c";
	end;
OnTimer1000:
	unittalk "�t�F������ : �n����h�邪������c�c";
	end;
OnTimer1000:
	unittalk "�t�F������ : ���̍s������ǂ��҂֓S�Ƃ��I";
	end;
OnTimer1000:
	unittalk "�t�F������ : �|���Ă��ꂽ�̂ˁB";
	end;
OnTimer1000:
	unittalk "�t�F������ : �ӂ��B���̂���ȂƂ���ɃK���I�����c�c�B";
	end;
OnTimer1000:
	unittalk "�t�F������ : ���̕ӂɂ͐������Ă��Ȃ��͂��B�܂����z�炩�c�c!!";
	end;
OnTimer1000:
	unittalk "�t�F������ : ���Ƃ���Ƃ܂�����ˁc�c�}���Ȃ��Ɓc�c�I";
	end;
OnTimer1000:
	hideoffnpc "#glast_event_3"; //68045
	hideonnpc "#glast_event_3"; //68045
	hideonnpc "#glast_event_3"; //68045
	end;
OnTimer1000:
	unittalk "�t�F������ : ���͒T�����������āA�O���X�g�w�C���ɗ����́B";
	end;
OnTimer1000:
	unittalk "�t�F������ : �����ǁc�c�����ɂ͂�����ז�����z�炪����݂�������B";
	end;
OnTimer1000:
	unittalk "�t�F������ : �c�c�B";
	end;
OnTimer1000:
	unittalk "�t�F������ : �˂��A���ɋ��͂��Ă���Ȃ�������H�@���肢�B";
	end;
OnTimer1000:
	unittalk "�t�F������ : �������͂��Ă����̂Ȃ�Ύ��ɂ��Ă��āI�@�z�炪�P���Ă���O�ɑ����s���܂��傤�I";
	end;
OnTimer1000:
	stopnpctimer;
	hideonnpc "�t�F������#glast_01"; //68034
	misceffect 60, "�t�F������#glast_01"; //68034
	announce "�]�t�F�������͓�֌��������悤�ł��B�t�F�������ɂ��Ă������I�]", 0x1, 0xffff00, 0x190, 20, 0, 0;
	hideoffnpc "#glast_move_01"; //68046
	misceffect 6, "#glast_move_01"; //68046
	misceffect 317, "#glast_move_01"; //68046
	end;
}
1@glast.gat,359,294,0	script	#glast_event_3	139,{/* 68045 (hide)*/}

1@glast.gat,352,279,0	script	#glast_move_01	45,4,4,{/* 68046 (hide)*/
	mes "�]�t�F��������ǂ������܂����H�]";
	next;
	switch(select("^0000FF�}���ňړ�����(�V���[�g�J�b�g)^000000","^FF0000�����Ĉړ�����^000000")) {
	case 1:
		mes "�]���Ȃ��̓t�F��������";
		mes "�@����}���Œǂ��������]";
		close2;
		warp getmdmapname("1@glast.gat"),47,264;
		end;
	}
}

1@glast.gat,347,265,0	script	#compass_1	139,{/* 68047 */}
1@glast.gat,47,270,4	script	�t�F������#glast_03	664,{/* 68048 */}
1@glast.gat,47,270,0	script	#glast_event_7	139,3,3,{/* 68049 */
	viewpoint 2, 1, 1, 0, 0xFFFFFF00; //68049
	hideonnpc "#glast_event_7"; //68049
	cutin "fenrir_a.bmp", 2;
	npctalk "�t�F������ : ���Ă��ꂽ�̂ˁA���肪�Ƃ��I",getmdnpcname("�t�F������#glast_03");
	set '@dummy,sleep2(2000);
	npctalk "�t�F������ : ���Ԃ��Ȃ���I�@�����A��������I",getmdnpcname("�t�F������#glast_03");
	set '@dummy,sleep2(2000);
	cutin "fenrir_a.bmp", 255;
	hideonnpc "�t�F������#glast_03"; //68048
	warp getmdmapname("1@glast.gat"),40,348;
	end;
}
1@glast.gat,43,347,0	script	#compass_8	139,3,3,{/* 68815 */
	viewpoint 2, 1, 1, 0, 0xFFFF00; //68815
	end;
}
1@glast.gat,44,357,0	script	#glast_event_9	139,3,3,{/* 68816 */
	mes "�]�Âт���������B";
	mes "�@�t�F�������̒T�������낤���H�]";
	next;
	if(select("^0000FF����}����(�V���[�g�J�b�g)^000000","^FF0000�t�F�������ɘb��������^000000")) {
	}
	cutin "fenrir_a.bmp", 2;
	mes "[�t�F������]";
	mes "���̌��c�c";
	mes "�Ƃ��Ƃ���������I";
	close2;
	cutin "fenrir_a.bmp", 255;
	hideonnpc "#glast_event_9"; //68816
	initnpctimer;
	end;
OnTimer1000:
	npctalk "�t�F������ : ���ꂪ�o���h�����g���Ă������A�Z���`�l���u���[�Y�ˁc�c�B",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	npctalk "�t�F������ : ��N���߂��������c�c����Ńo���h���̍s����ǂ������o�����I",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	npctalk "�t�F������ : �o���h���̐��܂�ς��c�c����ƁA����ƒT������!!",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	npctalk "�t�F������ : �c�c�b!?�@�׈��ȗ͂�������I",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	npctalk "�t�F������ : �N�������ˁI�@�o�Ă��Ȃ����I",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	hideoffnpc "�T���E�A�C����#glast_10"; //68818
	end;
OnTimer1000:
	npctalk "�T�� : �ӂӂӁc�c����ς�ǂ������Đ����ˁB�v���Ă����ʂ肾��B",getmdnpcname("�T���E�A�C����#glast_10");
	end;
OnTimer1000:
	npctalk "�T�� : ���̌������Ȃ�ł��傤�H",getmdnpcname("�T���E�A�C����#glast_10");
	end;
OnTimer1000:
	npctalk "�T�� : ������g���΁A��N�̕���ł������������Ƃ��o����B�����������ˁA�t�F�����X�E�t�F�������H",getmdnpcname("�T���E�A�C����#glast_10");
	end;
OnTimer1000:
	npctalk "�t�F������ : �܂����c�c���@���L���[�I",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	npctalk "�T�� : ���A���x�ꂽ��ˁB���̖��O�̓T���E�A�C�����B12���@���L���[��1�l��B",getmdnpcname("�T���E�A�C����#glast_10");
	end;
OnTimer1000:
	npctalk "�T�� : �t���C���l�̊肢�𐬂������邽�߂ɂ��c�c�ӂӂӂ��c�c���̌��͂�����������I",getmdnpcname("�T���E�A�C����#glast_10");
	end;
OnTimer1000:
	hideonnpc "�T���E�A�C����#glast_10"; //68818
	end;
OnTimer1000:
	npctalk "�t�F������ : �҂��Ȃ������I",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	npctalk "�t�F������ : �T����ǂ���I�@���ɂ��Ă��āI",getmdnpcname("�t�F������#glast_04");
	end;
OnTimer1000:
	stopnpctimer;
	hideoffnpc "#glast_event_warp_1"; //68819
	hideoffnpc "#glast_event_warp_2"; //68820
	hideoffnpc "#glast_event_warp_3"; //69357
	hideoffnpc "#glast_event_warp_4"; //69358
	hideoffnpc "#glast_event_warp_5"; //70121
	hideoffnpc "#glast_event_warp_6"; //70122
	hideoffnpc "#glast_event_warp_7"; //70123
	end;
}
1@glast.gat,44,357,8	script	�t�F������#glast_04	664,{/* 68817 */}
1@glast.gat,42,350,0	script	#glast_event_warp_1	139,5,5,{/* 68819 (hide)*/
	warp getmdmapname("1@glast.gat"),199,333;
	end;
}
1@glast.gat,44,366,0	script	#effect1	139,{/* 61189 */
OnStart:
	initnpctimer;
	end;
OnTimer5000:
	initnpctimer;
	misceffect 222, "#effect1"; //61189
	end;
}


//-----------------------------------------------------------------------------


1@glast.gat,335,262,5	script	�T���̌��e#chase_8	3190,{/* 58858 (hide)*/}
1@glast.gat,351,269,0	script	#glast_move_04	45,{/* 58860 (hide)*/
	mes "�]���̐�Ɉړ������";
	mes "�@^ff0000�p�[�e�B�[�����o�[�S��^000000��";
	mes "�@^ff0000�]��^000000����܂��B";
	mes "�@�ړ����Ă���낵���ł����H";
	if(select("������","�͂�") == 1)
		close;
	announce "�]�T���̖��͂̉e���������Ȃ����ׁA�u���b�h�M�K���e�X�v�Ɓu���v�����ł��܂����]", 0x1, 0xffff00, 0x190, 20, 0, 0;
	hideonnpc "#glast_move_04"; //71052
	warp getmdnpcname("1@glast.gat"),350,282;
	end;
}

1@glast.gat,353,290,8	script	�T���̌��e#glast_50	10066,{/* 61553 (hide)*/}

1@glast.gat,359,294,4	script	�t�F������#glast_11	664,{/* 65533 (hide)*/}
1@glast.gat,376,303,0	script	#glast_move_05	45,{/* 65534 (hide)*/}
1@glast.gat,352,279,0	script	#glast_move_01_	45,{/* 69520 */}
1@glast.gat,352,279,0	script	#glast_move_01_jp	45,{/* 65535 (hide)*/}

1@glast.gat,67,264,4	script	��#glast_sara8	10005,{/* 65843 (hide)*/}

1@glast.gat,42,273,0	script	#�o���P�[�h1_1	1905,{/* 65845 */}
1@glast.gat,43,273,0	script	#�o���P�[�h1_2	1905,{/* 65846 */}
1@glast.gat,44,273,0	script	#�o���P�[�h1_3	1905,{/* 65859 */}
1@glast.gat,45,273,0	script	#�o���P�[�h1_4	1905,{/* 65977 */}

1@glast.gat,39,343,0	script	#�o���P�[�h3_1	1905,{/* 66043 */}

1@glast.gat,42,343,0	script	#�o���P�[�h3_4	1905,{/* 66315 */}

1@glast.gat,67,264,4	script	���b�h�M�K���e�X#glast_	10067,{/* 66768 (hide)*/}

1@glast.gat,45,343,0	script	#�o���P�[�h3_7	1905,{/* 66920 */}
1@glast.gat,48,343,0	script	#�o���P�[�h3_10	1905,{/* 66975 */}
1@glast.gat,60,364,0	script	#�o���P�[�h4_1	1905,{/* 66977 */}
1@glast.gat,60,366,0	script	#�o���P�[�h4_3	1905,{/* 66978 */}
1@glast.gat,60,368,0	script	#�o���P�[�h4_5	1905,{/* 66979 */}

1@glast.gat,352,304,4	script	#effect_glast_event01	844,{/* 68035 (hide)*/}
1@glast.gat,360,304,4	script	#effect_glast_event01	844,{/* 68036 (hide)*/}
1@glast.gat,367,304,4	script	#effect_glast_event01	844,{/* 68037 (hide)*/}
1@glast.gat,366,295,4	script	#effect_glast_event01	844,{/* 68038 (hide)*/}
1@glast.gat,359,296,4	script	#effect_glast_event01	844,{/* 68039 (hide)*/}

1@glast.gat,353,294,4	script	#effect_glast_event01	844,{/* 68042 (hide)*/}
1@glast.gat,356,284,4	script	#effect_glast_event01	844,{/* 68043 (hide)*/}
1@glast.gat,345,283,4	script	#effect_glast_event01	844,{/* 68044 (hide)*/}

1@glast.gat,46,364,4	script	�T���E�A�C����#glast_10	10066,{/* 68818 (hide)*/}

1@glast.gat,52,346,0	script	#glast_event_warp_2	139,{/* 68820 (hide)*/}

1@glast.gat,62,279,4	script	��#glast_sara7	10005,{/* 69327 (hide)*/}

1@glast.gat,35,364,0	script	#glast_event_warp_3	139,{/* 69357 (hide)*/}
1@glast.gat,41,364,0	script	#glast_event_warp_4	139,{/* 69358 (hide)*/}
1@glast.gat,44,371,0	script	#glast_event_warp_5	139,{/* 70121 (hide)*/}
1@glast.gat,54,362,0	script	#glast_event_warp_6	139,{/* 70122 (hide)*/}
1@glast.gat,44,358,0	script	#glast_event_warp_7	139,{/* 70123 (hide)*/}



1@glast.gat,345,274,0	script	#�o���P�[�h12_1	1905,{/* 70792 */}
1@glast.gat,347,274,0	script	#�o���P�[�h12_3	1905,{/* 70793 */}
1@glast.gat,349,274,0	script	#�o���P�[�h12_5	1905,{/* 71126 */}
1@glast.gat,351,274,0	script	#�o���P�[�h12_7	1905,{/* 76437 */}
1@glast.gat,353,274,0	script	#�o���P�[�h12_9	1905,{/* 76438 */}
1@glast.gat,355,274,0	script	#�o���P�[�h12_11	1905,{/* 77020 */}
1@glast.gat,357,274,0	script	#�o���P�[�h12_13	1905,{/* 77021 */}
1@glast.gat,346,273,0	script	#�o���P�[�h12_16	1905,{/* 77022 */}
1@glast.gat,348,273,0	script	#�o���P�[�h12_18	1905,{/* 77023 */}
1@glast.gat,350,273,0	script	#�o���P�[�h12_20	1905,{/* 77024 */}
1@glast.gat,352,273,0	script	#�o���P�[�h12_22	1905,{/* 78277 */}
1@glast.gat,354,273,0	script	#�o���P�[�h12_24	1905,{/* 78278 */}
1@glast.gat,356,273,0	script	#�o���P�[�h12_26	1905,{/* 78279 */}
1@glast.gat,358,273,0	script	#�o���P�[�h12_28	1905,{/* 78280 */}

1@glast.gat,189,342,0	script	#glast_move_06_	45,{/* 71055 (hide)*/}
1@glast.gat,200,346,4	script	�T���E�A�C����#glast_jp	10066,{/* 71327 */}
1@glast.gat,200,340,0	script	�t�F������#b_	664,{/* 71328 */}
1@glast.gat,200,340,0	script	#bgm_change01_	139,{/* 71888 (hide)*/}
1@glast.gat,200,346,4	script	�T���E�A�C����#chase_0q	3190,{/* 71915 (hide)*/}
1@glast.gat,200,346,4	script	�T���̌��e#ex_battle_0q	10066,{/* 71353 (hide)*/}
1@glast.gat,200,346,0	script	#ex_battle_sara_	139,{/* 71354 */}

1@glast.gat,198,350,4	script	�t�F������#chase_	664,{/* 71893 (hide)*/}
1@glast.gat,200,350,0	script	#effect2_	139,{/* 73457 */}
1@glast.gat,199,202,0	script	#bgm_change02_	139,{/* 71890 */}
1@glast.gat,199,205,0	script	#glast_time_q1_	139,{/* 71891 */}
1@glast.gat,194,214,5	script	�T���̌��e#chase_1_	3190,{/* 69528 (hide)*/}
1@glast.gat,176,178,4	script	��#glast_sara3_	10005,{/* 69377 */}
1@glast.gat,245,187,4	script	���b�h�M�K���e�X#glast_	10067,{/* 71088 */}
1@glast.gat,268,130,0	script	#monster_gimmick_2_	139,{/* 71092 */}
1@glast.gat,200,135,4	script	��#glast_sara4_	10005,{/* 69378 */}
1@glast.gat,207,79,5	script	�T���̌��e#chase_2_	3190,{/* 69529 (hide)*/}
1@glast.gat,97,38,4	script	��#glast_sara5_	10005,{/* 69379 */}
1@glast.gat,82,109,6	script	���b�h�M�K���e�X#glast_	10067,{/* 69372 */}
1@glast.gat,67,264,4	script	���b�h�M�K���e�X#glast_	10067,{/* 71087 */}
1@glast.gat,67,264,4	script	��#glast_sara8_	10005,{/* 69382 (hide)*/}
1@glast.gat,62,279,4	script	��#glast_sara7_	10005,{/* 69381 */}
1@glast.gat,221,49,6	script	�T���̌��e#ch1_	10066,{/* 71916 (hide)*/}

1@glast.gat,259,54,5	script	�T���̌��e#chase_3_	3190,{/* 69530 (hide)*/}
1@glast.gat,299,85,6	script	���b�h�M�K���e�X#glast_	10067,{/* 71090 (hide)*/}
1@glast.gat,306,179,5	script	�T���̌��e#chase_4_	3190,{/* 69531 */}
1@glast.gat,302,197,4	script	���b�h�M�K���e�X#glast_	10067,{/* 71089 */}
1@glast.gat,302,194,4	script	��#glast_sara9_	10005,{/* 69383 (hide)*/}
1@glast.gat,298,204,0	script	#monster_gimmick_4_	139,{/* 71355 */}
1@glast.gat,298,210,5	script	�T���̌��e#chase_6_	3190,{/* 69533 (hide)*/}
1@glast.gat,321,250,5	script	�T���̌��e#chase_7_	3190,{/* 69534 (hide)*/}
1@glast.gat,335,262,5	script	�T���̌��e#chase_8_	3190,{/* 70903 */}
1@glast.gat,347,265,0	script	#compass_1_	139,{/* 69521 (hide)*/}
1@glast.gat,351,258,5	script	�T���̌��e#chase_9_	3190,{/* 70999 (hide)*/}

1@glast.gat,184,325,0	script	#�o���P�[�h6_2_	1905,{/* 69427 */}
1@glast.gat,186,325,0	script	#�o���P�[�h6_4_	1905,{/* 69428 */}
1@glast.gat,188,325,0	script	#�o���P�[�h6_6_	1905,{/* 69475 */}
1@glast.gat,190,325,0	script	#�o���P�[�h6_8_	1905,{/* 71539 */}
1@glast.gat,192,325,0	script	#�o���P�[�h6_10_	1905,{/* 71540 */}
1@glast.gat,194,325,0	script	#�o���P�[�h6_12_	1905,{/* 71541 */}
1@glast.gat,198,325,0	script	#�o���P�[�hcenter_2_	1905,{/* 71542 */}

1@glast.gat,201,325,0	script	#�o���P�[�hcenter_5_	1905,{/* 71545 */}

1@glast.gat,205,325,0	script	#�o���P�[�h7_2_	1905,{/* 71546 */}
1@glast.gat,207,325,0	script	#�o���P�[�h7_4_	1905,{/* 71547 */}
1@glast.gat,209,325,0	script	#�o���P�[�h7_6_	1905,{/* 71548 */}
1@glast.gat,211,325,0	script	#�o���P�[�h7_8_	1905,{/* 71549 */}
1@glast.gat,213,325,0	script	#�o���P�[�h7_10_	1905,{/* 71550 */}
1@glast.gat,215,325,0	script	#�o���P�[�h7_12	1905,{/* 71551 */}

1@glast.gat,180,328,0	script	#�o���P�[�h8_1_	1905,{/* 71552 */}
1@glast.gat,180,330,0	script	#�o���P�[�h8_3_	1905,{/* 71685 */}
1@glast.gat,180,332,0	script	#�o���P�[�h8_5_	1905,{/* 71686 */}

1@glast.gat,187,345,0	script	#�o���P�[�h9_1_	1905,{/* 71687 */}
1@glast.gat,189,346,0	script	#�o���P�[�h9_2_	1905,{/* 71688 */}

1@glast.gat,210,346,0	script	#�o���P�[�h10_1_	1905,{/* 71689 */}
1@glast.gat,212,345,0	script	#�o���P�[�h10_2_	1905,{/* 71690 */}

1@glast.gat,219,328,0	script	#�o���P�[�h11_1	1905,{/* 71691 */}
1@glast.gat,219,330,0	script	#�o���P�[�h11_3	1905,{/* 71692 */}
1@glast.gat,219,332,0	script	#�o���P�[�h11_5	1905,{/* 71872 */}

1@glast.gat,238,43,0	script	#monster_gimmick_3_	139,{/* 71093 */}
1@glast.gat,230,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71094 */}
1@glast.gat,235,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71095 */}
1@glast.gat,240,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71096 */}
1@glast.gat,245,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71097 */}
1@glast.gat,230,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71098 */}
1@glast.gat,235,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71183 */}
1@glast.gat,240,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71318 */}
1@glast.gat,245,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71319 */}


//--------------------------------------------------------------------------


1@glast.gat,359,294,4	script	�t�F������#glast_01_	664,{/* 71827 */}
1@glast.gat,359,296,4	script	#effect_glast_event01	844,{/* 71885 (hide)*/}
1@glast.gat,353,294,4	script	#effect_glast_event01	844,{/* 71886 (hide)*/}
1@glast.gat,359,294,0	script	#glast_event_3_	139,{/* 69519 (hide)*/}
1@glast.gat,353,290,8	script	�T���̌��e#glast_50_	10066,{/* 71330 (hide)*/}
1@glast.gat,359,294,4	script	�t�F������#glast_11_	664,{/* 71331 (hide)*/}
1@glast.gat,360,304,4	script	#effect_glast_event01	844,{/* 71850 (hide)*/}
1@glast.gat,367,304,4	script	#effect_glast_event01	844,{/* 71871 (hide)*/}
1@glast.gat,366,295,4	script	#effect_glast_event01	844,{/* 71884 (hide)*/}
1@glast.gat,376,303,0	script	#glast_move_05_	45,{/* 71332 (hide)*/}
1@glast.gat,352,304,4	script	#effect_glast_event01	844,{/* 71828 (hide)*/}
1@glast.gat,356,284,4	script	#effect_glast_event01	844,{/* 71887 (hide)*/}
misceffect 60, "�t�F������#glast_01_"; //71827
@spawn(type: BL_MOB, ID: 36249, speed: 150, option: 0, view: 3198, pos: "1@glast.gat"(355, 294), dir: 0, name: "�����ȃK���I��")
@nomalattack(src: "3198:�����ȃK���I��:1@glast.gat"(36249), dst: , damage: 0, sDelay: 624, dDelay: 412, tick: 785185920)
@nomalattack(src: "3198:�����ȃK���I��:1@glast.gat"(36249), dst: , damage: 0, sDelay: 624, dDelay: 412, aDelay: 903)
@nomalattack(src: "3198:�����ȃK���I��:1@glast.gat"(36249), dst: , damage: 0, sDelay: 624, dDelay: 412, aDelay: 903)
@mob_defeated("3198:�����ȃK���I��:1@glast.gat"(36249))
hideoffnpc "#glast_event_3_"; //69519
hideonnpc "#glast_event_3_"; //69519
hideonnpc "#glast_event_3_"; //69519
hideonnpc "�t�F������#glast_01_"; //71827
misceffect 60, "�t�F������#glast_01_"; //71827
announce "�]�t�F�������͓�֌��������悤�ł��B�t�F�������ɂ��Ă������I�]", 0x1, 0xffff00, 0x190, 20, 0, 0;
1@glast.gat,345,283,4	script	#effect_glast_event01	844,{/* 69518 (hide)*/}
1@glast.gat,352,279,0	script	#glast_move_01_	45,{/* 69520 */}
1@glast.gat,352,279,0	script	#glast_move_01_jp_	45,{/* 71352 (hide)*/}
1@glast.gat,345,274,0	script	#�o���P�[�h12_1_	1905,{/* 71873 */}
1@glast.gat,347,274,0	script	#�o���P�[�h12_3_	1905,{/* 71874 */}
1@glast.gat,349,274,0	script	#�o���P�[�h12_5_	1905,{/* 71875 */}
1@glast.gat,351,274,0	script	#�o���P�[�h12_7_	1905,{/* 71876 */}
1@glast.gat,353,274,0	script	#�o���P�[�h12_9_	1905,{/* 71877 */}
1@glast.gat,355,274,0	script	#�o���P�[�h12_11_	1905,{/* 71878 */}
1@glast.gat,357,274,0	script	#�o���P�[�h12_13_	1905,{/* 71879 */}
1@glast.gat,346,273,0	script	#�o���P�[�h12_16_	1905,{/* 71880 */}
1@glast.gat,348,273,0	script	#�o���P�[�h12_18_	1905,{/* 71881 */}
1@glast.gat,350,273,0	script	#�o���P�[�h12_20_	1905,{/* 71882 */}
1@glast.gat,352,273,0	script	#�o���P�[�h12_22_	1905,{/* 71883 */}
1@glast.gat,354,273,0	script	#�o���P�[�h12_24_	1905,{/* 71901 */}
1@glast.gat,356,273,0	script	#�o���P�[�h12_26_	1905,{/* 71919 */}
1@glast.gat,358,273,0	script	#�o���P�[�h12_28_	1905,{/* 71921 */}
1@glast.gat,351,269,0	script	#glast_move_04_	45,{/* 71052 (hide)*/}
mes "�]�t�F��������ǂ������܂����H�]";
next;
select("^0000FF�}���ňړ�����(�V���[�g�J�b�g)^000000:^FF0000�����Ĉړ�����^000000")
mes "�]���Ȃ��̓t�F��������";
mes "�@����}���Œǂ��������]";
close;
1@glast.gat,352,279,0	warp	#glast_move_01_	2,2,1@glast.gat,47,264 //69520 from_pos=(354, 280)
1@glast.gat,47,270,4	script	�t�F������#glast_03_	664,{/* 69522 */}
1@glast.gat,47,270,0	script	#glast_event_7_	139,{/* 69523 */}
1@glast.gat,42,273,0	script	#�o���P�[�h1_1_	1905,{/* 69384 */}
1@glast.gat,43,273,0	script	#�o���P�[�h1_2_	1905,{/* 69385 */}
1@glast.gat,44,273,0	script	#�o���P�[�h1_3_	1905,{/* 69386 */}
1@glast.gat,45,273,0	script	#�o���P�[�h1_4_	1905,{/* 69387 */}
cutin "fenrir_a.bmp", 2;
mes "[�t�F������]";
mes "���Ă��ꂽ�̂ˁA";
mes "���肪�Ƃ��I";
close;
cutin "fenrir_a.bmp", 255;
viewpoint 2, 1, 1, 0, 0xFFFFFF00; //69523
hideonnpc "#glast_event_7_"; //69523
cutin "fenrir_a.bmp", 2;
cutin "fenrir_a.bmp", 255;
hideonnpc "�t�F������#glast_03_"; //69522
@mapmoved(from: 1@glast.gat(47, 270), map: 1@glast.gat(40, 350))
1@glast.gat,44,366,0	script	#effect1_	139,{/* 73456 */}
misceffect 222, "#effect1_"; //73456
cutin "fenrir_a.bmp", 2;
mes "[�t�F������]";
mes "���̌��c�c";
mes "�Ƃ��Ƃ���������I";
close;
misceffect 222, "#effect1_"; //73456
cutin "fenrir_a.bmp", 255;
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
misceffect 222, "#effect1_"; //73456
@mapmoved(from: 1@glast.gat(44, 366), map: 1@glast.gat(199, 333))
1@glast.gat,189,342,0	script	#glast_move_06_	45,{/* 71055 (hide)*/}
1@glast.gat,186,325,0	script	#�o���P�[�h6_4_	1905,{/* 69428 */}
1@glast.gat,188,325,0	script	#�o���P�[�h6_6_	1905,{/* 69475 */}
1@glast.gat,190,325,0	script	#�o���P�[�h6_8_	1905,{/* 71539 */}
1@glast.gat,192,325,0	script	#�o���P�[�h6_10_	1905,{/* 71540 */}
1@glast.gat,194,325,0	script	#�o���P�[�h6_12_	1905,{/* 71541 */}
1@glast.gat,198,325,0	script	#�o���P�[�hcenter_2_	1905,{/* 71542 */}
1@glast.gat,187,345,0	script	#�o���P�[�h9_1_	1905,{/* 71687 */}
1@glast.gat,189,346,0	script	#�o���P�[�h9_2_	1905,{/* 71688 */}
1@glast.gat,200,346,4	script	�T���E�A�C����#glast_jp	10066,{/* 71327 */}
1@glast.gat,200,340,0	script	�t�F������#b_	664,{/* 71328 */}
1@glast.gat,200,340,0	script	#bgm_change01_	139,{/* 71888 (hide)*/}
1@glast.gat,200,346,4	script	�T���E�A�C����#chase_0q	3190,{/* 71915 (hide)*/}
1@glast.gat,200,346,4	script	�T���̌��e#ex_battle_0q	10066,{/* 71353 (hide)*/}
1@glast.gat,200,346,0	script	#ex_battle_sara_	139,{/* 71354 */}
1@glast.gat,201,325,0	script	#�o���P�[�hcenter_5_	1905,{/* 71545 */}
1@glast.gat,205,325,0	script	#�o���P�[�h7_2_	1905,{/* 71546 */}
1@glast.gat,207,325,0	script	#�o���P�[�h7_4_	1905,{/* 71547 */}
1@glast.gat,209,325,0	script	#�o���P�[�h7_6_	1905,{/* 71548 */}
1@glast.gat,211,325,0	script	#�o���P�[�h7_8_	1905,{/* 71549 */}
1@glast.gat,213,325,0	script	#�o���P�[�h7_10_	1905,{/* 71550 */}
1@glast.gat,210,346,0	script	#�o���P�[�h10_1_	1905,{/* 71689 */}
1@glast.gat,212,345,0	script	#�o���P�[�h10_2_	1905,{/* 71690 */}
mes "�]�t�F�������ƃT�����Λ����Ă���!�]";
next;
select("^FF0000�퓬�����͂���^000000::�����l����")
mes "�]�Λ�������l��O�ɁA";
mes "�@���Ȃ��͂ǂ����ׂ���";
mes "�@���������l���Ă݂邱�Ƃɂ����]";
close;
1@glast.gat,184,325,0	script	#�o���P�[�h6_2_	1905,{/* 69427 */}
1@glast.gat,198,350,4	script	�t�F������#chase_	664,{/* 71893 (hide)*/}
1@glast.gat,200,350,0	script	#effect2_	139,{/* 73457 */}
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
mes "�]�t�F�������ƃT�����Λ����Ă���!�]";
next;
select("^FF0000�퓬�����͂���^000000::�����l����")
mes "�]��l�̑Ό������͂��鎖�ɂ����]";
close;
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 8, "�t�F������#b_"; //71328
misceffect 521, "�t�F������#b_"; //71328
misceffect 583, "�t�F������#b_"; //71328
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
hideoffnpc "#bgm_change01_"; //71888
musiceffect "44";
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
1@glast.gat,180,328,0	script	#�o���P�[�h8_1_	1905,{/* 71552 */}
1@glast.gat,180,330,0	script	#�o���P�[�h8_3_	1905,{/* 71685 */}
1@glast.gat,180,332,0	script	#�o���P�[�h8_5_	1905,{/* 71686 */}
misceffect 222, "#effect2_"; //73457
misceffect 903, "�t�F������#b_"; //71328
misceffect 222, "#effect2_"; //73457
misceffect 831, "�T���E�A�C����#glast_jp"; //71327
misceffect 222, "#effect2_"; //73457
misceffect 886, "�t�F������#b_"; //71328
misceffect 930, "�t�F������#b_"; //71328
misceffect 916, "�T���E�A�C����#glast_jp"; //71327
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
hideonnpc "�t�F������#b_"; //71328
hideonnpc "�T���E�A�C����#glast_jp"; //71327
hideoffnpc "�t�F������#chase_"; //71893
hideoffnpc "�T���E�A�C����#chase_0q"; //71915
misceffect 222, "#effect2_"; //73457
misceffect 222, "#effect2_"; //73457
misceffect 651, "�T���E�A�C����#chase_0q"; //71915
1@glast.gat,189,342,0	warp	#glast_move_06_	2,2,1@glast.gat,201,204 //71055 from_pos=(193, 343)
1@glast.gat,199,202,0	script	#bgm_change02_	139,{/* 71890 */}
1@glast.gat,199,205,0	script	#glast_time_q1_	139,{/* 71891 */}
1@glast.gat,194,214,5	script	�T���̌��e#chase_1_	3190,{/* 69528 (hide)*/}
musiceffect "147";
setquest 120160; //state=1
delquest 120160;
viewpoint 1, 351, 270, 0, 0xFFFF0000; //71891
announce "�t�F������ : ���߂�Ȃ����A�͂����肸���܂��ړ����ł��Ȃ�������B�@�����ō������܂��傤�c�c�I", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "�T�� : �������Ȃ���!!���̖��͂̋��낵�����������Ă���!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "�]�T���̖��͂̉e���ŁA�u�T���̌��e�v�A�u���b�h�M�K���e�X�v�A�u���v���o�����܂����I", 0x1, 0xffff00, 0x190, 20, 0, 0;
1@glast.gat,176,178,4	script	��#glast_sara3_	10005,{/* 69377 */}
announce "�]5���ȓ��Ƀt�F�������̌��ɂ��ǂ蒅���ƁA��V�o���l���啝�A�b�v�I����Ɂu�T���̌��e�v�Ɛ키���Ƃ��ł��܂��]", 0x1, 0xffff00, 0x190, 20, 0, 0;
hideonnpc "��#glast_sara3_"; //69377
misceffect 10, "��#glast_sara3_"; //69377
announce "�T�� : ���ɏ|�˂�������������Ȃ����I", 0x1, 0x00ebff, 0x190, 20, 0, 0;
delitem 938, 1;
getitem 730, 1;
delitem 7063, 1;
getitem 7229, 1;
getitem 7229, 1;
announce "�T�� : �l�Y�~�݂����ɓ����₪����!!�@���ł����Ă���!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "�t�F������ : �T���A�`���[�`���[�B����Ŗ����H�߂܂��Ă݂Ȃ������I", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "�T�� : !!�@�t�F�������I���̑��łԂ��Ă���!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
delitem 1013, 1;
getitem 719, 1;
delitem 930, 1;
getitem 723, 1;
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "�]1���o�߁]", 0x1, 0xffff00, 0x190, 20, 0, 0;
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,245,187,4	script	���b�h�M�K���e�X#glast_	10067,{/* 71088 */}
hideonnpc "���b�h�M�K���e�X#glast_"; //71088
@spawn(type: BL_MOB, ID: 12374, speed: 300, option: 0, view: 3193, pos: "1@glast.gat"(245, 187), dir: 0, name: "�o�����b�h�M�K���e�X#X2")
announce "�T�� : �ǂ��ɂ���!!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,268,130,0	script	#monster_gimmick_2_	139,{/* 71092 */}
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
hideonnpc "#monster_gimmick_2_"; //71092
@spawn(type: BL_MOB, ID: 3759, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(267, 140), dir: 0, name: "�M�K���e�X#gb1")
@spawn(type: BL_MOB, ID: 4945, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(268, 140), dir: 0, name: "�M�K���e�X#gb2")
@spawn(type: BL_MOB, ID: 5357, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(269, 140), dir: 0, name: "�M�K���e�X#gb3")
@spawn(type: BL_MOB, ID: 16957, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(215, 72), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 14828, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "�@���̃M�K���e�X#aa1")
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,200,135,4	script	��#glast_sara4_	10005,{/* 69378 */}
hideonnpc "��#glast_sara4_"; //69378
misceffect 10, "��#glast_sara4_"; //69378
getitem 719, 1;
getitem 723, 1;
getitem 730, 1;
announce "�]2���o�߁]", 0x1, 0xffff00, 0x190, 20, 0, 0;
getitem 7229, 1;
1@glast.gat,207,79,5	script	�T���̌��e#chase_2_	3190,{/* 69529 (hide)*/}
@spawn(type: BL_MOB, ID: 13160, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 15199, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "�@���̃M�K���e�X#bb1")
misceffect 34, "�T���̌��e#chase_2_"; //69529
hideoffnpc "�T���̌��e#chase_2_"; //69529
misceffect 135, "�T���̌��e#chase_2_"; //69529
@spawn(type: BL_MOB, ID: 42452, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(207, 79), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 32930, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(207, 79), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 351, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(207, 79), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 783, speed: 2000, option: 0, view: 3200, pos: "1@glast.gat"(207, 79), dir: 0, name: "#earth")
@nomalattack(src: "3199:#meteo:1@glast.gat"(351), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785518623)
@nomalattack(src: "3200:#earth:1@glast.gat"(783), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785518623)
@nomalattack(src: "3199:#meteo:1@glast.gat"(32930), dst: , damage: 85, sDelay: 1000, dDelay: 412, tick: 785518623)
@nomalattack(src: "3199:#meteo:1@glast.gat"(42452), dst: , damage: 94, sDelay: 1000, dDelay: 412, tick: 785518623)
@changeoption(id: 351, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(351), dst: 351, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 783, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3200:#earth:1@glast.gat"(783), dst: 783, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 32930, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(32930), dst: 32930, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 42452, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(42452), dst: 42452, skill: "�C���r�W�u��"(353), val: 1)
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
@spawn(type: BL_MOB, ID: 48145, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(190, 46), dir: 0, name: "�M�K���e�X#aa5")
@spawn(type: BL_MOB, ID: 48206, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(158, 52), dir: 0, name: "�M�K���e�X#aa6")
@spawn(type: BL_MOB, ID: 35448, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(157, 53), dir: 0, name: "�o���M�K���e�X#bb6")
@spawn(type: BL_MOB, ID: 31153, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(156, 40), dir: 0, name: "�o���M�K���e�X#bb6")
@spawn(type: BL_MOB, ID: 48538, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(151, 39), dir: 0, name: "�M�K���e�X#aa6")
@spawn(type: BL_MOB, ID: 33718, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(151, 44), dir: 0, name: "�o���M�K���e�X#bb6")
@spawn(type: BL_MOB, ID: 32709, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(145, 47), dir: 0, name: "�M�K���e�X#aa6")
@spawn(type: BL_MOB, ID: 5932, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(144, 38), dir: 0, name: "�M�K���e�X#aa6")
@spawn(type: BL_MOB, ID: 47828, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(144, 43), dir: 0, name: "�o���M�K���e�X#bb6")
announce "�T�� : ���̖��@�ŕ��X�ɂ��Ă����!!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,97,38,4	script	��#glast_sara5_	10005,{/* 69379 */}
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
hideonnpc "��#glast_sara5_"; //69379
misceffect 10, "��#glast_sara5_"; //69379
getitem 7229, 1;
getitem 730, 1;
getitem 719, 1;
delitem 929, 1;
getitem 7228, 1;
delitem 1034, 1;
getitem 6803, 1;
getitem 7229, 1;
getitem 723, 1;
announce "�T�� : ���͂͂́I�@�����瓦������Ǝv���Ă���́H", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,82,109,6	script	���b�h�M�K���e�X#glast_	10067,{/* 69372 */}
hideonnpc "���b�h�M�K���e�X#glast_"; //69372
@spawn(type: BL_MOB, ID: 7142, speed: 350, option: 0, view: 3196, pos: "1@glast.gat"(82, 109), dir: 0, name: "���b�h�M�K���e�X#X7")
@spawn(type: BL_MOB, ID: 29943, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(75, 157), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 40119, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(68, 159), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 41211, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(70, 155), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 18430, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(66, 161), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 36021, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(71, 163), dir: 0, name: "�@���̃M�K���e�X#bb1")
announce "�]3���o�߁]", 0x1, 0xffff00, 0x190, 20, 0, 0;
@spawn(type: BL_MOB, ID: 20769, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(61, 158), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 30463, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(62, 163), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 42188, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(62, 164), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 37769, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(72, 188), dir: 0, name: "�M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 24037, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(72, 188), dir: 0, name: "�o���M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 23050, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(75, 197), dir: 0, name: "�M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 37929, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(73, 195), dir: 0, name: "�M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 37994, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(69, 194), dir: 0, name: "�M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 38362, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(72, 206), dir: 0, name: "�o���M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 1955, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(70, 203), dir: 0, name: "�o���M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 26074, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(74, 203), dir: 0, name: "�o���M�K���e�X#bb1")
1@glast.gat,67,264,4	script	���b�h�M�K���e�X#glast_	10067,{/* 71087 */}
1@glast.gat,67,264,4	script	��#glast_sara8_	10005,{/* 69382 (hide)*/}
hideonnpc "���b�h�M�K���e�X#glast_"; //71087
@spawn(type: BL_MOB, ID: 15978, speed: 350, option: 0, view: 3196, pos: "1@glast.gat"(67, 264), dir: 0, name: "���b�h�M�K���e�X#X1")
@nomalattack(src: "3196:���b�h�M�K���e�X#X1:1@glast.gat"(15978), dst: , damage: 0, sDelay: 800, dDelay: 412, tick: 785574826)
1@glast.gat,62,279,4	script	��#glast_sara7_	10005,{/* 69381 */}
hideonnpc "��#glast_sara7_"; //69381
misceffect 10, "��#glast_sara7_"; //69381
getitem 7229, 1;
announce "�T�� : �����Ă����ʂ�I�@�o���c�������������Ă�����I", 0x1, 0x00ebff, 0x190, 20, 0, 0;
getitem 719, 1;
getitem 730, 1;
@nomalattack(src: "3196:���b�h�M�K���e�X#X1:1@glast.gat"(15978), dst: , damage: 0, sDelay: 800, dDelay: 412, aDelay: 8442)
getitem 723, 1;
@nomalattack(src: "3191:�o���M�K���e�X#bb1:1@glast.gat"(1955), dst: , damage: 2255, sDelay: 750, dDelay: 412, tick: 785594983)
@nomalattack(src: "3191:�o���M�K���e�X#bb1:1@glast.gat"(1955), dst: , damage: 2260, sDelay: 750, dDelay: 412, aDelay: 1113)
announce "�T�� : �S�āA�S�Ă�j�󂵂Ă�������!!", 0x1, 0x00ebff, 0x190, 20, 0, 0;
announce "�T�� : �����Ă����ʂ�I�@�o���c�������������Ă�����I", 0x1, 0x00ebff, 0x190, 20, 0, 0;
@spawn(type: BL_MOB, ID: 30957, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(177, 59), dir: 4, name: "�M�K���e�X#aa5")
@spawn(type: BL_MOB, ID: 13313, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(177, 65), dir: 1, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 47813, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(190, 55), dir: 6, name: "�o���M�K���e�X#bb5")
@spawn(type: BL_MOB, ID: 47816, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(0, 0), dir: 0, name: "�o���M�K���e�X#bb5")
@spawn(type: BL_MOB, ID: 49986, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(199, 55), dir: 0, name: "�o���M�K���e�X#bb5")
@spawn(type: BL_MOB, ID: 48948, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(205, 47), dir: 0, name: "�M�K���e�X#aa5")
@spawn(type: BL_MOB, ID: 47704, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(208, 44), dir: 0, name: "�o���M�K���e�X#bb5")
@spawn(type: BL_MOB, ID: 18333, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(208, 59), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 15462, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(210, 44), dir: 1, name: "�@���̃M�K���e�X#bb1")
@nomalattack(src: "3194:�M�K���e�X#aa5:1@glast.gat"(48948), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785619702)
announce "�T�� : ���ɏ|�˂�������������Ȃ����I", 0x1, 0x00ebff, 0x190, 20, 0, 0;
@nomalattack(src: "3191:�o���M�K���e�X#bb5:1@glast.gat"(47704), dst: , damage: 2608, sDelay: 750, dDelay: 412, tick: 785620017)
@nomalattack(src: "3195:�@���̃M�K���e�X#bb1:1@glast.gat"(15462), dst: , damage: 1724, sDelay: 500, dDelay: 412, tick: 785620143)
1@glast.gat,221,49,6	script	�T���̌��e#ch1_	10066,{/* 71916 (hide)*/}
@spawn(type: BL_MOB, ID: 49627, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(222, 54), dir: 4, name: "�M�K���e�X#aa5")
@nomalattack(src: "3195:�@���̃M�K���e�X#bb1:1@glast.gat"(15462), dst: , damage: 1573, sDelay: 500, dDelay: 412, aDelay: 924)
1@glast.gat,230,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71094 */}
1@glast.gat,230,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71098 */}
1@glast.gat,235,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71095 */}
1@glast.gat,235,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71183 */}
1@glast.gat,238,43,0	script	#monster_gimmick_3_	139,{/* 71093 */}
1@glast.gat,240,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71096 */}
1@glast.gat,240,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71318 */}
1@glast.gat,245,51,3	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71097 */}
1@glast.gat,245,44,1	script	�K�[�S�C���̐Α�#glast_	10070,{/* 71319 */}
hideonnpc "#monster_gimmick_3_"; //71093
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71094
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71095
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71096
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71097
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71098
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71183
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71318
hideonnpc "�K�[�S�C���̐Α�#glast_"; //71319
@spawn(type: BL_MOB, ID: 11235, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(227, 48), dir: 0, name: "�@���̃M�K���e�X#gc1")
@spawn(type: BL_MOB, ID: 46762, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(250, 48), dir: 0, name: "�@���̃M�K���e�X#gc2")
@spawn(type: BL_MOB, ID: 8503, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(230, 51), dir: 0, name: "�T���̎g����#gc3")
@spawn(type: BL_MOB, ID: 3021, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(235, 51), dir: 0, name: "�T���̎g����#gc4")
@spawn(type: BL_MOB, ID: 4279, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(240, 51), dir: 0, name: "�T���̎g����#gc5")
@spawn(type: BL_MOB, ID: 4516, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(245, 51), dir: 0, name: "�T���̎g����#gc6")
@spawn(type: BL_MOB, ID: 5310, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(230, 44), dir: 0, name: "�T���̎g����#gc7")
@spawn(type: BL_MOB, ID: 7227, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(235, 44), dir: 0, name: "�T���̎g����#gc8")
@spawn(type: BL_MOB, ID: 7647, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(240, 44), dir: 0, name: "�T���̎g����#gc9")
@spawn(type: BL_MOB, ID: 19285, speed: 200, option: 0, view: 3197, pos: "1@glast.gat"(245, 44), dir: 0, name: "�T���̎g����#gc10")
@nomalattack(src: "3197:�T���̎g����#gc7:1@glast.gat"(5310), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625874)
@nomalattack(src: "3197:�T���̎g����#gc8:1@glast.gat"(7227), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625875)
@nomalattack(src: "3197:�T���̎g����#gc9:1@glast.gat"(7647), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625875)
@nomalattack(src: "3197:�T���̎g����#gc10:1@glast.gat"(19285), dst: , damage: 0, sDelay: 720, dDelay: 412, tick: 785625875)
@nomalattack(src: "3197:�T���̎g����#gc7:1@glast.gat"(5310), dst: , damage: 93, sDelay: 720, dDelay: 412, aDelay: 797)
@nomalattack(src: "3197:�T���̎g����#gc8:1@glast.gat"(7227), dst: , damage: 0, sDelay: 720, dDelay: 412, aDelay: 796)
@nomalattack(src: "3197:�T���̎g����#gc9:1@glast.gat"(7647), dst: , damage: 0, sDelay: 720, dDelay: 412, aDelay: 796)
@nomalattack(src: "3197:�T���̎g����#gc10:1@glast.gat"(19285), dst: , damage: 0, sDelay: 720, dDelay: 412, aDelay: 796)
announce "�]4���o�߁]", 0x1, 0xffff00, 0x190, 20, 0, 0;
1@glast.gat,259,54,5	script	�T���̌��e#chase_3_	3190,{/* 69530 (hide)*/}
misceffect 34, "�T���̌��e#chase_3_"; //69530
@spawn(type: BL_MOB, ID: 44104, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(299, 79), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 42949, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(305, 81), dir: 0, name: "�@���̃M�K���e�X#aa1")
1@glast.gat,299,85,6	script	���b�h�M�K���e�X#glast_	10067,{/* 71090 (hide)*/}
@spawn(type: BL_MOB, ID: 44310, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(305, 91), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 44515, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(300, 86), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 44651, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(292, 85), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 45186, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(304, 85), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 45242, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(306, 89), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 42565, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(303, 93), dir: 0, name: "�@���̃M�K���e�X#aa1")
@nomalattack(src: "3195:�@���̃M�K���e�X#bb1:1@glast.gat"(45242), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785633313)
@changeoption(id: 9404, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 9418, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 9564, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 9572, opt1: 0, opt2: 0, option: 4, karma: 0)
announce "�T�� : �����Ă����ʂ�I�@�o���c�������������Ă�����I", 0x1, 0x00ebff, 0x190, 20, 0, 0;
1@glast.gat,306,179,5	script	�T���̌��e#chase_4_	3190,{/* 69531 */}
@spawn(type: BL_MOB, ID: 9404, speed: 2000, option: 4, view: 3199, pos: "1@glast.gat"(306, 179), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 9418, speed: 2000, option: 4, view: 3199, pos: "1@glast.gat"(306, 179), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 9564, speed: 2000, option: 4, view: 3199, pos: "1@glast.gat"(306, 179), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 9572, speed: 2000, option: 4, view: 3200, pos: "1@glast.gat"(306, 179), dir: 0, name: "#earth")
1@glast.gat,302,197,4	script	���b�h�M�K���e�X#glast_	10067,{/* 71089 */}
1@glast.gat,302,194,4	script	��#glast_sara9_	10005,{/* 69383 (hide)*/}
@nomalattack(src: "3199:#meteo:1@glast.gat"(9404), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785640874)
@nomalattack(src: "3199:#meteo:1@glast.gat"(9418), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785640874)
@nomalattack(src: "3199:#meteo:1@glast.gat"(9564), dst: , damage: 85, sDelay: 1000, dDelay: 412, tick: 785640874)
@nomalattack(src: "3200:#earth:1@glast.gat"(9572), dst: , damage: 94, sDelay: 1000, dDelay: 412, tick: 785640874)
1@glast.gat,298,204,0	script	#monster_gimmick_4_	139,{/* 71355 */}
hideonnpc "���b�h�M�K���e�X#glast_"; //71089
@spawn(type: BL_MOB, ID: 12117, speed: 350, option: 0, view: 3196, pos: "1@glast.gat"(302, 197), dir: 0, name: "���b�h�M�K���e�X#X3")
1@glast.gat,298,210,5	script	�T���̌��e#chase_6_	3190,{/* 69533 (hide)*/}
@changeoption(id: 6346, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 6538, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 6957, opt1: 0, opt2: 0, option: 4, karma: 0)
@changeoption(id: 7072, opt1: 0, opt2: 0, option: 4, karma: 0)
1@glast.gat,321,250,5	script	�T���̌��e#chase_7_	3190,{/* 69534 (hide)*/}
1@glast.gat,335,262,5	script	�T���̌��e#chase_8_	3190,{/* 70903 */}
@spawn(type: BL_MOB, ID: 49886, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(332, 255), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 3950, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(334, 261), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 1430, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(331, 255), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 12125, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(335, 262), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 12274, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(335, 262), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 12399, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(335, 262), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 12714, speed: 2000, option: 0, view: 3200, pos: "1@glast.gat"(335, 262), dir: 0, name: "#earth")
@changeoption(id: 12125, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(12125), dst: 12125, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 12274, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(12274), dst: 12274, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 12399, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(12399), dst: 12399, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 12714, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3200:#earth:1@glast.gat"(12714), dst: 12714, skill: "�C���r�W�u��"(353), val: 1)
@spawn(type: BL_MOB, ID: 3701, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(340, 267), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 15352, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(342, 266), dir: 0, name: "�@���̃M�K���e�X#bb1")
@spawn(type: BL_MOB, ID: 24420, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(337, 262), dir: 0, name: "�@���̃M�K���e�X#bb1")
@nomalattack(src: "3195:�@���̃M�K���e�X#aa1:1@glast.gat"(49886), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785645032)
@nomalattack(src: "3199:#meteo:1@glast.gat"(12125), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785645179)
@nomalattack(src: "3199:#meteo:1@glast.gat"(12274), dst: , damage: 78, sDelay: 1000, dDelay: 412, tick: 785645179)
@nomalattack(src: "3199:#meteo:1@glast.gat"(12399), dst: , damage: 0, sDelay: 1000, dDelay: 412, tick: 785645179)
@nomalattack(src: "3200:#earth:1@glast.gat"(12714), dst: , damage: 85, sDelay: 1000, dDelay: 412, tick: 785645179)
1@glast.gat,347,265,0	script	#compass_1_	139,{/* 69521 (hide)*/}
1@glast.gat,351,258,5	script	�T���̌��e#chase_9_	3190,{/* 70999 (hide)*/}
@spawn(type: BL_MOB, ID: 49240, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(334, 271), dir: 0, name: "�@���̃M�K���e�X#aa1")
@spawn(type: BL_MOB, ID: 10929, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(340, 270), dir: 0, name: "�@���̃M�K���e�X#aa1")
hideonnpc "�T���̌��e#chase_8_"; //70903
misceffect 34, "�T���̌��e#chase_9_"; //70999
hideoffnpc "�T���̌��e#chase_9_"; //70999
misceffect 135, "�T���̌��e#chase_9_"; //70999
@spawn(type: BL_MOB, ID: 40226, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(351, 258), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 40472, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(351, 258), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 40515, speed: 2000, option: 0, view: 3199, pos: "1@glast.gat"(351, 258), dir: 0, name: "#meteo")
@spawn(type: BL_MOB, ID: 41840, speed: 2000, option: 0, view: 3200, pos: "1@glast.gat"(351, 258), dir: 0, name: "#earth")
@nomalattack(src: "3199:#meteo:1@glast.gat"(40226), dst: , damage: 94, sDelay: 1000, dDelay: 412, tick: 785646271)
@nomalattack(src: "3199:#meteo:1@glast.gat"(40472), dst: , damage: 103, sDelay: 1000, dDelay: 412, tick: 785646271)
@nomalattack(src: "3199:#meteo:1@glast.gat"(40515), dst: , damage: 112, sDelay: 1000, dDelay: 412, tick: 785646271)
@nomalattack(src: "3200:#earth:1@glast.gat"(41840), dst: , damage: 0, sDelay: 1000, dDelay: 412, tick: 785646271)
@changeoption(id: 40226, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(40226), dst: 40226, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 40472, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(40472), dst: 40472, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 40515, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3199:#meteo:1@glast.gat"(40515), dst: 40515, skill: "�C���r�W�u��"(353), val: 1)
@changeoption(id: 41840, opt1: 0, opt2: 0, option: 4, karma: 0)
@skillnodamage(src: "3200:#earth:1@glast.gat"(41840), dst: 41840, skill: "�C���r�W�u��"(353), val: 1)
mes "�]���̐�Ɉړ������";
mes "�@^ff0000�p�[�e�B�[�����o�[�S��^000000��";
mes "�@^ff0000�]��^000000����܂��B";
mes "�@�ړ����Ă���낵���ł����H";
select("������:�͂�")
hideonnpc "�T���̌��e#chase_9_"; //70999
@nomalattack(src: "3195:�@���̃M�K���e�X#aa1:1@glast.gat"(3701), dst: , damage: 1374, sDelay: 500, dDelay: 412, tick: 785651290)
@nomalattack(src: "3195:�@���̃M�K���e�X#bb1:1@glast.gat"(15352), dst: , damage: 1287, sDelay: 500, dDelay: 412, tick: 785651290)
@nomalattack(src: "3195:�@���̃M�K���e�X#aa1:1@glast.gat"(10929), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785651353)
@nomalattack(src: "3195:�@���̃M�K���e�X#aa1:1@glast.gat"(3701), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:�@���̃M�K���e�X#bb1:1@glast.gat"(15352), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:�@���̃M�K���e�X#aa1:1@glast.gat"(10929), dst: , damage: 1563, sDelay: 500, dDelay: 412, aDelay: 903)
announce "�]�T���̖��͂̉e���������Ȃ����ׁA�u���b�h�M�K���e�X�v�Ɓu���v�����ł��܂����]", 0x1, 0xffff00, 0x190, 20, 0, 0;
hideonnpc "#glast_move_04_"; //71052
1@glast.gat,351,269,0	warp	#glast_move_04_	2,2,1@glast.gat,350,282 //71052 from_pos=(351, 269)
misceffect 718, "�T���̌��e#glast_50_"; //71330
hideoffnpc "�T���̌��e#glast_50_"; //71330
misceffect 1065, "�T���̌��e#glast_50_"; //71330
misceffect 718, "�T���̌��e#glast_50_"; //71330
hideonnpc "�T���̌��e#glast_50_"; //71330
cutin "fenrir_a.bmp", 2;
mes "[�t�F������]";
mes "�������ŉ����ł��B";
mes "���̗͂�����Ȃ������΂����";
mes "�����f�����������܂����B";
next;
hideoffnpc "#glast_move_01_jp_"; //71352
misceffect 6, "#glast_move_01_jp_"; //71352
misceffect 317, "#glast_move_01_jp_"; //71352
mes "[�t�F������]";
mes "����ɂ��Ă�";
mes "�������������ł��ˁB";
next;
mes "[�t�F������]";
mes "�c�c���āB���͂��낻��s���܂��B";
mes "��`���Ă���������";
mes "���肪�Ƃ��������܂����B";
next;
mes "[�t�F������]";
mes "�ǂ����A��قǃT���̏�������";
mes "���e��g������";
mes "�܂��c���Ă���悤�ł����A";
mes "���̂܂ܕ����Ă����Ă�";
mes "���̖`���҂ɑ傫�Ȕ�Q��";
mes "�o�鎖�͂Ȃ��Ǝv���܂��B";
next;
mes "[�t�F������]";
mes "�K���T���{�l�͋��܂��񂩂�A";
mes "���e���x�Ȃ�ǂ��ɂ��Ȃ�ł��傤�B";
mes "�����A���Ȃ������z���";
mes "�|���Ă�������ƌ����̂ł����";
mes "���Ђ��肢���܂��B";
next;
mes "[�t�F������]";
mes "���͐���}���܂��̂ŁA";
mes "��`�����Ƃ͂ł��܂��񂪁A";
mes "�傫�ȗ͂��c��ꏊ�ֈړ��ł���悤";
mes "�����J���Ă����܂����B";
mes "�������̗͂Ɛ키�̂ł���΁A";
mes "��̃��[�v���ړ����Ă��������B";
next;
mes "[�t�F������]";
mes "�������A���������͏o���܂���̂�";
mes "���̂܂܂��A��ɂȂ��Ă�";
mes "�\���܂����B";
mes "���̏ꍇ�͂ǂ������C������";
mes "���A�艺�����B";
next;
mes "[�t�F������]";
mes "����͂���`�������Ē�����";
mes "����ł��B";
mes "�ǂ����A���󂯎�肭�������B";
next;
mes "^ff0000�]�e��s�A�X�̃G���`�����g��";
mes "�@�����ŏ������ł��錠����";
mes "�@�l�����܂����]^000000";
next;
mes "[�t�F������]";
mes "�܂��A�ǂ����ł���ł����";
mes "�ǂ��ł��ˁB";
next;
mes "[�t�F������]";
mes "����H";
mes "�ǂ����ו��̎�ނ������悤�ł��B";
mes "�ו��̎�ނ����炵�Ă���";
mes "�܂����������Ă��������B";
close;
cutin "fenrir_a.bmp", 255;
delitem 932, 1;
cutin "fenrir_a.bmp", 2;
mes "[�t�F������]";
mes "�������ŉ����ł��B";
mes "���̗͂�����Ȃ������΂����";
mes "�����f�����������܂����B";
next;
mes "[�t�F������]";
mes "����ɂ��Ă�";
mes "�������������ł��ˁB";
next;
mes "[�t�F������]";
mes "�c�c���āB���͂��낻��s���܂��B";
mes "��`���Ă���������";
mes "���肪�Ƃ��������܂����B";
next;
mes "[�t�F������]";
mes "�ǂ����A��قǃT���̏�������";
mes "���e��g������";
mes "�܂��c���Ă���悤�ł����A";
mes "���̂܂ܕ����Ă����Ă�";
mes "���̖`���҂ɑ傫�Ȕ�Q��";
mes "�o�鎖�͂Ȃ��Ǝv���܂��B";
next;
mes "[�t�F������]";
mes "�K���T���{�l�͋��܂��񂩂�A";
mes "���e���x�Ȃ�ǂ��ɂ��Ȃ�ł��傤�B";
mes "�����A���Ȃ������z���";
mes "�|���Ă�������ƌ����̂ł����";
mes "���Ђ��肢���܂��B";
next;
mes "[�t�F������]";
mes "���͐���}���܂��̂ŁA";
mes "��`�����Ƃ͂ł��܂��񂪁A";
mes "�傫�ȗ͂��c��ꏊ�ֈړ��ł���悤";
mes "�����J���Ă����܂����B";
mes "�������̗͂Ɛ키�̂ł���΁A";
mes "��̃��[�v���ړ����Ă��������B";
next;
mes "[�t�F������]";
mes "�������A���������͏o���܂���̂�";
mes "���̂܂܂��A��ɂȂ��Ă�";
mes "�\���܂����B";
mes "���̏ꍇ�͂ǂ������C������";
mes "���A�艺�����B";
next;
mes "[�t�F������]";
mes "����͂���`�������Ē�����";
mes "����ł��B";
mes "�ǂ����A���󂯎�肭�������B";
next;
mes "^ff0000�]�e��s�A�X�̃G���`�����g��";
mes "�@�����ŏ������ł��錠����";
mes "�@�l�����܂����]^000000";
next;
mes "[�t�F������]";
mes "�܂��A�ǂ����ł���ł����";
mes "�ǂ��ł��ˁB";
setquest 9337; //state=1
delquest 9337;
setquest 120150; //state=1
delquest 120150;
setquest 120155; //state=1
delquest 120155;
getexp 2998015,0; //3000000
getexp 0,1498210; //1500000
getitem 6803, 1;
setquest 120170; //state=1
delquest 120170;
close;
cutin "fenrir_a.bmp", 255;
mes "[�t�F������]";
mes "�܂��A�ǂ����ł���ł����";
mes "�ǂ��ł��ˁB";
close;
cutin "fenrir_a.bmp", 255;
getitem 932, 1;
mes "�]��������T���̌��e������ꏊ��";
mes "�@�s�����Ƃ��o����悤���]";
next;
select("���̏�ɗ��܂�:��֐i��")
mes "�]��֐i�ނ��Ƃɂ����]";
close;
@mapmoved(from: 1@glast.gat(352, 279), map: 1@glast.gat(199, 333))
@spawn(type: BL_MOB, ID: 12309, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(185, 333), dir: 0, name: "�o���M�K���e�X")
@spawn(type: BL_MOB, ID: 20133, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(185, 331), dir: 0, name: "�@���̃M�K���e�X")
@spawn(type: BL_MOB, ID: 25266, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(185, 329), dir: 0, name: "�M�K���e�X")
@spawn(type: BL_MOB, ID: 35027, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(185, 327), dir: 0, name: "�M�K���e�X")
@spawn(type: BL_MOB, ID: 16986, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(213, 333), dir: 0, name: "�o���M�K���e�X")
@spawn(type: BL_MOB, ID: 746, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(213, 331), dir: 0, name: "�@���̃M�K���e�X")
@spawn(type: BL_MOB, ID: 5468, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(213, 329), dir: 0, name: "�o���M�K���e�X")
@spawn(type: BL_MOB, ID: 11832, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(213, 327), dir: 0, name: "�o���M�K���e�X")
@spawn(type: BL_MOB, ID: 3923, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(183, 333), dir: 0, name: "�M�K���e�X")
@spawn(type: BL_MOB, ID: 10794, speed: 320, option: 0, view: 3194, pos: "1@glast.gat"(183, 331), dir: 0, name: "�M�K���e�X")
@spawn(type: BL_MOB, ID: 49714, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(183, 329), dir: 0, name: "�@���̃M�K���e�X")
@spawn(type: BL_MOB, ID: 12498, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(183, 327), dir: 0, name: "�o���M�K���e�X")
@mob_defeated("3195:�@���̃M�K���e�X:1@glast.gat"(20133))
getexp -2899826,0; //100174
getexp 0,-1449826; //50174
@spawn(type: BL_MOB, ID: 35204, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "�@���̃M�K���e�X")
@spawn(type: BL_MOB, ID: 48364, speed: 250, option: 0, view: 3191, pos: "1@glast.gat"(0, 0), dir: 0, name: "�o���M�K���e�X")
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(49714), dst: , damage: 1608, sDelay: 500, dDelay: 412, tick: 785745837)
@mob_defeated("3194:�M�K���e�X:1@glast.gat"(25266))
getexp 1826,0; //102000
getexp 0,826; //51000
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(49714), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(49714), dst: , damage: 1297, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(49714), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@mob_defeated("3195:�@���̃M�K���e�X:1@glast.gat"(49714))
getexp -1826,0; //100174
getexp 0,-826; //50174
@mob_defeated("3194:�M�K���e�X:1@glast.gat"(35027))
getexp 1826,0; //102000
getexp 0,826; //51000
@nomalattack(src: "3191:�o���M�K���e�X:1@glast.gat"(48364), dst: , damage: 2549, sDelay: 750, dDelay: 412, tick: 785754972)
@nomalattack(src: "3194:�M�K���e�X:1@glast.gat"(3923), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785755518)
@nomalattack(src: "3191:�o���M�K���e�X:1@glast.gat"(48364), dst: , damage: 0, sDelay: 750, dDelay: 412, aDelay: 1113)
@nomalattack(src: "3194:�M�K���e�X:1@glast.gat"(3923), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3194:�M�K���e�X:1@glast.gat"(10794), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785756610)
@mob_defeated("3194:�M�K���e�X:1@glast.gat"(3923))
getexp 0,0; //102000
getexp 0,0; //51000
@nomalattack(src: "3191:�o���M�K���e�X:1@glast.gat"(48364), dst: , damage: 0, sDelay: 750, dDelay: 412, aDelay: 1974)
@spawn(type: BL_MOB, ID: 47360, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "�@���̃M�K���e�X")
@spawn(type: BL_MOB, ID: 38796, speed: 200, option: 0, view: 3195, pos: "1@glast.gat"(0, 0), dir: 0, name: "�@���̃M�K���e�X")
@mob_defeated("3194:�M�K���e�X:1@glast.gat"(10794))
getexp 0,0; //102000
getexp 0,0; //51000
@mob_defeated("3191:�o���M�K���e�X:1@glast.gat"(48364))
getexp 11200,0; //113200
getexp 0,11000; //62000
@mob_defeated("3191:�o���M�K���e�X:1@glast.gat"(12309))
getexp 0,0; //113200
getexp 0,0; //62000
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(35204), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785767003)
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(47360), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785767003)
getitem 7229, 1;
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(35204), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1617)
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(47360), dst: , damage: 1762, sDelay: 500, dDelay: 412, aDelay: 1617)
@mob_defeated("3195:�@���̃M�K���e�X:1@glast.gat"(35204))
getexp -13026,0; //100174
getexp 0,-11826; //50174
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(47360), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1722)
@mob_defeated("3191:�o���M�K���e�X:1@glast.gat"(12498))
getexp 13026,0; //113200
getexp 0,11826; //62000
@mob_defeated("3195:�@���̃M�K���e�X:1@glast.gat"(47360))
getexp -13026,0; //100174
getexp 0,-11826; //50174
@mob_defeated("3191:�o���M�K���e�X:1@glast.gat"(16986))
getexp 13026,0; //113200
getexp 0,11826; //62000
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(38796), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785776243)
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(38796), dst: , damage: 1775, sDelay: 500, dDelay: 412, aDelay: 903)
@mob_defeated("3195:�@���̃M�K���e�X:1@glast.gat"(38796))
getexp -13026,0; //100174
getexp 0,-11826; //50174
@mob_defeated("3191:�o���M�K���e�X:1@glast.gat"(11832))
getexp 13026,0; //113200
getexp 0,11826; //62000
@mob_defeated("3191:�o���M�K���e�X:1@glast.gat"(5468))
getexp 0,0; //113200
getexp 0,0; //62000
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(746), dst: , damage: 0, sDelay: 500, dDelay: 412, tick: 785794036)
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(746), dst: , damage: 1771, sDelay: 500, dDelay: 412, aDelay: 903)
@nomalattack(src: "3195:�@���̃M�K���e�X:1@glast.gat"(746), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 903)
@mob_defeated("3195:�@���̃M�K���e�X:1@glast.gat"(746))
getexp -13026,0; //100174
getexp 0,-11826; //50174
1@glast.gat,215,325,0	script	#�o���P�[�h7_12	1905,{/* 71551 */}
1@glast.gat,219,328,0	script	#�o���P�[�h11_1	1905,{/* 71691 */}
1@glast.gat,219,330,0	script	#�o���P�[�h11_3	1905,{/* 71692 */}
1@glast.gat,219,332,0	script	#�o���P�[�h11_5	1905,{/* 71872 */}
getitem 7229, 1;
@nomalattack(src: ""(), dst: , damage: 0, sDelay: 0, dDelay: 0, tick: 785864470)
@nomalattack(src: ""(), dst: , damage: 0, sDelay: 0, dDelay: 0, aDelay: 483)
mes "�]�T���̌��e������B";
mes "�@�킨�����H�]";
next;
select("�키:��߂Ă���")
mes "�]�T���̌��e�Ɛ킨���Ɛg�\�����";
mes "�@���e��������ɋC�t�����悤���]";
close;
mes "�]�T���̌��e������B";
mes "�@�킨�����H�]";
next;
hideonnpc "�T���̌��e#ex_battle_0q"; //71353
@spawn(type: BL_MOB, ID: 19622, speed: 125, option: 0, view: 3190, pos: "1@glast.gat"(200, 346), dir: 0, name: "�T���̌��e#1")
select("�키:��߂Ă���")
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 1875, sDelay: 500, dDelay: 412, tick: 785872375)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
close;
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2430, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , skill: "�˂��h���U��"(158), skill_lv: -1, damage: 3470, sDelay: 500, dDelay: 412, tick: 785873888)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�͈͐Ή��U��"(666), skill_lv: 5, damage: -30000, sDelay: 500, dDelay: 0, tick: 785874392)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2289, sDelay: 500, dDelay: 412, aDelay: 1513)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 1930, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , skill: "�������U��"(189), skill_lv: -1, damage: 5352, sDelay: 500, dDelay: 412, tick: 785876912)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�O�����h�N���X"(254), val: 65535, tick: 785877416)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�O�����h�N���X"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785877437)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�O�����h�N���X"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785877752)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�O�����h�N���X"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785878067)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 2016)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 515, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 498, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�t�@�C�A�[�E�H�[��"(18), val: 65535, tick: 785880440)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1008)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 454, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 361, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 468, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�͈͐����U��"(668), skill_lv: 5, damage: -30000, sDelay: 500, dDelay: 0, tick: 785883464)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 397, sDelay: 500, dDelay: 412, aDelay: 1008)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2539, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 1808, sDelay: 500, dDelay: 412, aDelay: 504)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "���e�I�X�g�[��"(83), val: 65535, tick: 785885459)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 434, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 444, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 441, sDelay: 500, dDelay: 412, aDelay: 505)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 455, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 525, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 384, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 378, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 446, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 357, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 512, sDelay: 500, dDelay: 412, aDelay: 504)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "���e�I�X�g�[��"(83), val: 65535, tick: 785890458)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 477, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 525, sDelay: 500, dDelay: 412, aDelay: 503)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 424, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 502, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 486, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 508, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 492, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 366, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 518, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 499, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 425, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 394, sDelay: 500, dDelay: 412, aDelay: 506)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 381, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 371, sDelay: 500, dDelay: 412, aDelay: 505)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 510)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 439, sDelay: 500, dDelay: 412, aDelay: 511)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 425, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 469, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 395, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 505, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 435, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 383, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 471, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 370, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2445, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2090, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2122, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2515, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2620, sDelay: 500, dDelay: 412, aDelay: 504)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , skill: "�˂��h���U��"(158), skill_lv: -1, damage: 3301, sDelay: 500, dDelay: 412, tick: 785905657)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�͈͐Ή��U��"(666), skill_lv: 5, damage: -30000, sDelay: 500, dDelay: 0, tick: 785906160)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 1512)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2744, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2271, sDelay: 500, dDelay: 412, aDelay: 1008)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2023, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 1829, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2439, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 0, sDelay: 500, dDelay: 412, aDelay: 504)
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 2363, sDelay: 500, dDelay: 412, aDelay: 504)
@skillcasting(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "���b�V���A�^�b�N"(349), pl: 0, tick: 500)
@skillnodamage(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "���b�V���A�^�b�N"(349), val: 5)
misceffect 207,""; //self
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 6975, sDelay: 500, dDelay: 412, aDelay: 1512)
misceffect 207,""; //self
@nomalattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: , damage: 7984, sDelay: 500, dDelay: 412, aDelay: 504)
misceffect 207,""; //self
misceffect 207,""; //self
misceffect 207,""; //self
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "���[�h�I�u���@�[�~���I��"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "���[�h�I�u���@�[�~���I��"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "���[�h�I�u���@�[�~���I��"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "���[�h�I�u���@�[�~���I��"(85), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785915022)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785915023)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�O�����h�N���X"(254), val: 65535, tick: 785917752)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�O�����h�N���X"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785917773)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�O�����h�N���X"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785918088)
@skillattack(src: "3190:�T���̌��e#1:1@glast.gat"(19622), dst: 19622, skill: "�O�����h�N���X"(254), skill_lv: 10, damage: 0, sDelay: 0, dDelay: 300, tick: 785918403)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785919054)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785919054)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785919054)
@skillposeffect(src: "3190:�T���̌��e#1:1@glast.gat"(19622), skill: "�T���_�[�X�g�[��"(21), val: 65535, tick: 785919054)
