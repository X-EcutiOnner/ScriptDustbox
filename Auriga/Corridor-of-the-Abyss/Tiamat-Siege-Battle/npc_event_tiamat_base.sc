pab_base01.gat,340,95,4	script	�����Ǘ���#pab_base01	418,{/* 942 */
	mes "[�����Ǘ���]";
	mes "�������ō��Ɍ�����";
	mes "���͎҂��W���Ă��܂��B";
	{
		mes "�@";
		mes "�o�^�l�� : 233^000000";
	}
	next;
	switch(select("^888888�u�肷��^000000","^000000��V���󂯎��^000000","�������ō��ɂ���","�������m�F����","��������")) {
	case 1:
		mes "[�����Ǘ���]";
		mes "�����͊��ӂ������܂��B";
		mes "�����A���݂͍�펞�ԊO���A";
		mes "�܂��͍�킪���ɏI�����Ă��܂��B";
		mes "����ȍ~�̍���";
		mes "�����͂����肢���܂��B";
		close;
	case 2:
		{
			mes "[�����Ǘ���]";
			mes "��V�͍��ɁA�Q����������������";
			mes "���n�����Ă���܂��B";
			close;
		}
		{
			mes "[�����Ǘ���]";
			mes "����̍��̕�V��";
			mes "���ɂ��n�����Ă���܂��B";
			mes "�����͊��ӂ������܂��B";
			close;
		}
		getitem 6488, 1;
		mes "[�����Ǘ���]";
		mes "�����͊��ӂ������܂��B";
		mes "�u�e�B�A�}�g�U����V�`�P�b�g�v��";
		mes "���󂯎�肭�������I";
		mes "�������A�`�P�b�g�ɂ�^ff000060��^000000��";
		mes "�L���������������܂��̂ŁA";
		mes "�Y�ꂸ�ɂ������������������B";
		next;
		mes "[�����Ǘ���]";
		mes "�u�e�B�A�}�g�U����V�`�P�b�g�v��";
		mes "�q�ɂɓ���邱�Ƃ��\�ł��̂ŁA";
		mes "���D���ȃL�����N�^�[��";
		mes "��V������������̂���낵���ł��傤�B";
		close;
	case 3:
		break;
	case 4:
		mes "<<�����>>";
		mes "�o�^�l�� : 103";
		mes "��t�� : ^888888��t�I��^000000";
		next;
		mes "[�����Ǘ���]";
		mes "�˓��̍ۂ͎��ɂ��\���t�����������B";
		mes "�`���җl�̂��͂���������ł��B";
		mes "�����́A���҂����Ă���܂��B";
		close;
	case 5:
		mes "[�����Ǘ���]";
		mes "���������͂���������̂ł����";
		mes "�܂����z�����������B";
		mes "���������͂������܂���";
		mes "���������̐����������߂邽�߂ɂ�";
		mes "�l��͑��������ǂ��̂ł��B";
		close;
	}
	while(1) {
		mes "[�����Ǘ���]";
		mes "�������܂�܂����B";
		mes "�������ō��ɂ���";
		mes "�����������܂��B";
		next;
		mes "[�����Ǘ���]";
		mes "���݁A��X�͉���e�B�A�}�g�̑O��";
		mes "�z�w���Ă���܂��B";
		mes "��킪�J�n����܂�����";
		mes "���u�Ƌ��ɓ˓���";
		mes "����ɐ���^ff0000����^000000��";
		mes "������邱�Ƃ��ڕW�ƂȂ�܂��B";
		next;
		mes "[�����Ǘ���]";
		mes "��펞�Ԓ��ɂȂ�܂�����";
		mes "����ɓ˓��������܂��̂�";
		mes "���ɂ��\���t�����������B";
		next;
		mes "<�����{����>";
		mes "�E���̕�";
		mes "�@��펞�� : ";
		mes "�@15��0���@�`�@16��30��";
		mes "�@";
		mes "�E��̕�";
		mes "�@��펞�� : ";
		mes "�@22��30���@�`�@24��0��";
		mes "�@";
		mes "^ff0000����V�̔z�z��";
		mes "�@���I������s���܂��B";
		mes "�@�N�G�X�g�E�B���h�E��";
		mes "�@�L�ڂ���Ă������������";
		mes "�@���󂯎�肭�������B^000000";
		next;
		mes "[�����Ǘ���]";
		mes "�Q�����Ă������������ɂ�";
		mes "�u�e�B�A�}�g�U����V�`�P�b�g�v���u1�v��";
		mes "��V�Ƃ��āA���n���������܂��B";
		mes "�`�P�b�g�ɂ�^ff000060��^000000��";
		mes "�L���������������܂��̂ŁA";
		mes "�Y�ꂸ�ɂ������������������B";
		next;
		mes "[�����Ǘ���]";
		mes "�`�P�b�g�́A�ׂɂ���";
		mes "�u^0000ff�`�P�b�g������^000000�v�ɓn�����Ƃ�";
		mes "BaseLv�ɉ�����BaseExp��";
		mes "�S���̍d�� 2500�Ɍ����\�ł��B";
		next;
		mes "<BaseExp��V�Ή��\>";
		mes "BaseLv  1 -  99 : ^0000ff3,000,000^000000";
		mes "BaseLv100 - 109 : ^0000ff5,000,000^000000";
		mes "BaseLv110 - 119 : ^0000ff10,000,000^000000";
		mes "BaseLv120 - 129 : ^0000ff20,000,000^000000";
		mes "BaseLv130 - 139 : ^0000ff30,000,000^000000";
		mes "BaseLv140 - 149 : ^0000ff50,000,000^000000";
		mes "BaseLv150 - 159 : ^0000ff100,000,000^000000";
		mes "BaseLv160 - 169 : ^0000ff300,000,000^000000";
		mes "BaseLv170 - 179 : ^0000ff3,000,000,000^000000";
		mes "BaseLv180 - 185 : ^0000ff10,000,000,000^000000";
		mes "^ff0000��BaseExp��10��ɕ����Ď󂯎��܂��B^000000";
		next;
		mes "[�����Ǘ���]";
		mes "�܂��ABaseLv170�ȏ�̋��҂ɂ�";
		mes "���̌��ʂɉ�����";
		mes "�ǉ��ŕ�V��1�I�ׂ܂��B";
		next;
		mes "<�ǉ���V�ꗗ>";
		mes "�����W�����g�����B�� :";
		mes "^0000ff���V����W�I�C�A[0] 1��^000000";
		mes "�@";
		mes "�T������ 500�_�B�� :";
		mes "^0000ff�e�B�A�}�g�I�[�u(��) 1��^000000";
		mes "�@";
		mes "�T������ 700�_�B�� :";
		mes "^0000ff���A�̕⋋���� 5��^000000";
		mes "�@";
		mes "�T������ 800�_�B�� :";
		mes "^0000ff���킦���V�����l�R[0] 1��^000000";
		mes "�@";
		mes "�T������ 900�_�B�� :";
		mes "^0000ff�e�B�A�}�g�I�[�u(��) 1��^000000";
		mes "�܂���";
		mes "^0000ff���A�̕⋋���� 7��^000000";
		mes "�@";
		mes "�T������ 1000�_�B�� :";
		mes "^0000ff�e�B�A�}�g�I�[�u(��) 1��^000000";
		mes "�܂���";
		mes "^0000ff�t�H�b�N�X�w�A[0] 1��^000000";
		mes "�܂���";
		mes "^0000ff���A�̕⋋���� 10��^000000";
		mes "�@";
		mes "^ff0000�����A�̕⋋������";
		mes "�@�������̌��̒�����1��ނ�";
		mes "�@�A�C�e���������_���Ŋl���ł��܂��B";
		mes "�@�܂��A�����B�����Ă���ꍇ��";
		mes "�@�ł��������݂̂��I���\�ł��B";
		mes "�@";
		mes "���`�P�b�g���󂯎�����ۂ�";
		mes "�@�Q�����Ă������̓_���ɉ�����";
		mes "�@��V���I���\�ł��B^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�u�e�B�A�}�g�U����V�`�P�b�g�v���g���Ă�";
		mes "��V���������Ɋւ��Ă�";
		mes "���ꃏ�[���h���ł����";
		mes "�ǂ̃L�����N�^�[�ň��������Ă��������Ă�";
		mes "��育�����܂���B^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�`�P�b�g�̎󂯎���1��̊J�Âɂ�";
		mes "����Q�[���A�J�E���g��1��܂łł��B";
		mes "�������[���h�A�����L�����N�^�[��";
		mes "���Q�������������ꍇ�ł�";
		mes "�u1�v�L�����N�^�[�̂�";
		mes "��V�̎󂯎�肪�\�ł��B^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�`�P�b�g���󂯎�������";
		mes "���̉��ւ̎Q���͏o���܂���B";
		mes "���̃��[���h�╡���L�����N�^�[��";
		mes "������ɎQ�����Ă���ꍇ��";
		mes "�Q�����o���Ȃ��Ȃ�܂��B^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�ꕔ�̃��[���h�ł͓��ꎞ��";
		mes "�Q���������I���o���܂����A";
		mes "��x�I������Ƃ��̉�͕ύX��";
		mes "�ł��܂���̂ł����ӂ��������B^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�܂��A�v���C���p�����Ȃ��A�J�E���g��";
		mes "��팋�ʂ������������ꍇ�A";
		mes "���ւ̍v���x���Ⴂ�ꍇ�Ȃǂ�";
		mes "�`�P�b�g�����n���ł��Ȃ��ꍇ���������܂��B";
		mes "�\�߂��������������B^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�܂��A���ւ̍v���x���V�̎���";
		mes "�o�^��ɊJ�Â��ꂽ1��Ɍ���L���ł��B";
		mes "�T�[�o�[�_�E���Ȃǂ̃g���u��";
		mes "�������͂��̌���ł͂Ȃ�";
		mes "�S�Ă̏�Ԃ����Z�b�g����܂��B^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�e�B�A�}�g�U���ł�";
		mes "��ʃ}�b�v�g�p�����X�L���ɉ����A";
		mes "�_���W�����̐���i�s�����";
		mes "�T�[�o�[���׌y���̂��߂�";
		mes "���L�̃X�L���̎g�p�����";
		mes "�ꕔ�̃_���[�W���ʂ���������܂��B";
		mes "�@";
		mes "�e���|�[�g";
		mes "�A�C�X�E�H�[��";
		mes "�X�p�C�_�[�E�F�u";
		mes "�C���e�B�~�f�C�g";
		mes "���z�ƌ��Ɛ��̊���";
		mes "��������̉���";
		mes "�t���C�f�[�i�C�g�t�B�[�o�[";
		mes "�n���̉�";
		mes "���炬�̎q��S";
		mes "�A���[�W��";
		mes "�n�[���i�C�Y";
		mes "�X�e�C�V�X";
		mes "�u���b�f�B���X�g";
		mes "�J�I�X�p�j�b�N";
		mes "�}���z�[��";
		mes "�\�[���E�H�[��";
		mes "�V���h�E�t�H�[��";
		mes "�f�B�����V�����h�A";
		mes "�A�u���J�^�u��";
		mes "�t�@�C�A�[�E�H�[��";
		mes "���e�I�X�g�[��";
		mes "���[�h�I�u���@�[�~���I��";
		mes "�X�g�[���K�X�g";
		mes "�N�@�O�}�C�A";
		mes "�O���r�e�[�V�����t�B�[���h";
		mes "�T���N�`���A��";
		mes "�}�O�k�X�G�N�\�V�Y��";
		mes "�o�W���J";
		mes "�S�X�y��";
		mes "�o�C�I�����g�Q�C��";
		mes "�f�����[�W";
		mes "�{���P�[�m";
		mes "�Ή��w";
		mes "����";
		mes "���J";
		mes "�[�z�̃A�T�V���N���X";
		mes "�C�h�D���̗ь�";
		mes "�n�~���O";
		mes "����Y��Ȃ��Łc";
		mes "�K�^�̃L�X";
		mes "�q���";
		mes "�[���̒���";
		mes "���L�̋���";
		mes "�i���̍���";
		mes "�s���g�̃W�[�N�t���[�h";
		mes "�j�����h�̉�";
		mes "�푾�ۂ̋���";
		mes "�j�[�x�����O�̎w��";
		mes "�U���c��";
		mes "�o�C�I�v�����g";
		mes "�X�t�B�A�[�}�C��";
		mes "�A���͔|";
		mes "�V���o�[�X�i�C�p�[";
		mes "�}�W�b�N�f�R�C";
		mes "�C�k�n�b�J���e�I^000000";
		next;
		mes "^ff0000[�C���t�H���[�V����]";
		mes "�܂��A�e�B�A�}�g�U���ł�";
		mes "�����}�b�v����3��퓬�s�\�ɂȂ�ƁA";
		mes "�Z�[�u�|�C���g�ɋ����]������܂��B";
		mes "���̃}�b�v�Ɉړ���������";
		mes "�J�E���g�̓��Z�b�g����܂��B^000000";
		next;
		mes "[�����Ǘ���]";
		mes "�����͈ȏ�ł��B";
		mes "������x�m�F�������܂����H";
		next;
		if(select("������","�͂�") == 1) {
			mes "[�����Ǘ���]";
			mes "���Ж`���җl�̂��͂�";
			mes "��X�ɂ��݂����������B";
			mes "�����́A���҂����Ă���܂��B";
			close;
		}
	}
}
pab_base01.gat,336,95,5	script	�`�P�b�g������#pab_base	90,{/* 943 */
	mes "[�`�P�b�g������]";
	mes "�u�e�B�A�}�g�U����V�`�P�b�g�v��";
	mes "��V�̌������󂯕t���Ă���܂��B";
	mes "��V���e�ɂ��Ăׂ͗ɂ���";
	mes "�u�����Ǘ����v�ɂāA���m�F���������B";
	next;
	if(select("^888888��������^000000","��߂�") == 2) {
		mes "[�`�P�b�g������]";
		mes "�������܂�܂����B";
		mes "�`�P�b�g�ƕ�V�̌�����";
		mes "���߂�ꂽ���ԓ��ɂ��ς܂����������B";
		mes "�����p�����҂����Ă���܂��B";
		close;
	}
	if(countitem(6488) == 0) {
		mes "[�`�P�b�g������]";
		mes "�u�e�B�A�}�g�U����V�`�P�b�g�v��";
		mes "�������łȂ��悤�ł��B";
		mes "���܈�x�A�����A�C�e����";
		mes "���m�F�����肢�������܂��B";
		close;
	}
	mes "[�`�P�b�g������]";
	mes "�u�e�B�A�}�g�U����V�`�P�b�g�v";
	mes "1���ɂ��A1��̌������\�ł��B";
	mes "�����������܂����H";
	mes "�@";
	mes "^ff0000<<��팋��>>";
	mes "�����W�����g�����ς� / �T������ 1000�_^000000";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�`�P�b�g������]";
		mes "�������܂�܂����B";
		mes "�`�P�b�g�ƕ�V�̌�����";
		mes "���߂�ꂽ���ԓ��ɂ��ς܂����������B";
		mes "�����p�����҂����Ă���܂��B";
		close;
	}
	mes "[�`�P�b�g������]";
	mes "�`���җl��BaseLv170�ȏ�ł��̂ŁA";
	mes "�ǉ���V�����I�ђ����܂��B";
	mes "�ǂ���ɂȂ����܂����H";
	next;
	switch(select("�����l����:���V����W�I�C�A[0]:�e�B�A�}�g�I�[�u(��):���A�̕⋋���� 10��:�e�B�A�}�g�I�[�u(��):�e�B�A�}�g�I�[�u(��):���킦���V�����l�R[0]:�t�H�b�N�X�w�A[0]:��߂�")) {
	default:
	}
	mes "[�`�P�b�g������]";
	mes "^ff0000�u�e�B�A�}�g�I�[�u(��)�v��";
	mes "�󂯎���Ă���";
	mes "28���ŏ��ł��܂��B^000000";
	mes "�u�e�B�A�}�g�I�[�u(��)�v��";
	mes "��낵���ł��傤���H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�`�P�b�g������]";
		mes "�������܂�܂����B";
		mes "�`�P�b�g�ƕ�V�̌�����";
		mes "���߂�ꂽ���ԓ��ɂ��ς܂����������B";
		mes "�����p�����҂����Ă���܂��B";
		close;
	}
	mes "[�`�P�b�g������]";
	mes "���n�������V�́c";
	mes "�c�c";
	mes "�c�c";
	mes "�c�c";
	delitem 6488, 1;
	getitem 25749, 2500;
	getitem 25748, 1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	getexp 300000000,0,1;
	mes "������ł��B���󂯎�肭�������I";
	mes "�܂��̂����́A���҂����Ă���܂��B";
	close;
}

pab_base01.gat,350,108,5	script	�������A#pab_base01	10361,{/* 1005 (hide)*/
	mes "^0000FF�]�]�҂Ƙb������ł���悤���B";
	mes "�@�ʂ̎҂ɘb�𕷂����]^000000";
	close;
OnInit:
OnStart:
	initnpctimer;
	end;
OnTimer5000:
	initnpctimer;
	emotion (rand(2)? 1: 33), "�������A#pab_base01"; //973
	emotion (rand(2)? 19: 23), "�l�R�m�~���J#pab_base01"; //974
	emotion (rand(2)? 9: 32), "�l�R�m�n�E���h#pab_base"; //975
	emotion (rand(2)? 29: 56), "�l�R�m���[�E�F��#pab_ba"; //976
	end;
}
pab_base01.gat,352,105,9	script	�l�R�m�~���J#pab_base01	728,{/* 1006 (hide)*/
	mes "^0000FF�]�����Ƙb������ł���悤���B";
	mes "�@�ʂ̎҂ɘb�𕷂����]^000000";
	close;
}
pab_base01.gat,353,107,9	script	�l�R�m�n�E���h#pab_base	420,{/* 1007 (hide)*/
	mes "^0000FF�]�����Ƙb������ł���悤���B";
	mes "�@�ʂ̎҂ɘb�𕷂����]^000000";
	close;
}
pab_base01.gat,349,105,7	script	�l�R�m���[�E�F��#pab_ba	416,{/* 1008 (hide)*/
	mes "^0000FF�]�����Ƙb������ł���悤���B";
	mes "�@�ʂ̎҂ɘb�𕷂����]^000000";
	close;
}
pab_base01.gat,334,102,5	script	���{���Ïp�m#pab_base01	641,{/* 1009 */
	mes "[���{���Ïp�m]";
	mes "���҂����Ă���܂����A�`���җl�B";
	mes "���̎��Â�ʒu�Z�[�u�A";
	mes "��ԓ]���A�e�탌���^���̃T�[�r�X��";
	mes "�񋟂��Ă���܂��B";
	mes "���ЁA�����p���������B";
	next;
	switch(select("���̎���","�ʒu�Z�[�u","��ԓ]��","�e�탌���^��","��߂�")) {
	case 1:
		mes "[���{���Ïp�m]";
		mes "���̎��Â�HP��SP��";
		mes "^0000ff5000 Zeny^000000��100%�܂ŉ񕜂��A";
		mes "��Ԉُ�̉����A";
		mes "��ꂽ�A�C�e���̏C�����s���T�[�r�X�ł��B";
		mes "�����p�ɂȂ��܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���{���Ïp�m]";
			mes "�������܂�܂����B";
			mes "�T�[�r�X�������p�ɂȂ肽������";
			mes "���ł����z�����������B";
			close;
		}
		if(Zeny < 5000) {
			mes "[���{���Ïp�m]";
			mes "���́c�c�B";
			mes "���Âɂ�^0000ff5000 Zeny^000000��";
			mes "�K�v�Ȃ̂ł����c�c�B";
			close;
		}
		set Zeny,Zeny-5000;
		npcskillsupport 28,9999,"���{���Ïp�m#pab_base01";//�q�[��
		misceffect 7,"";
		misceffect 14,"";
		misceffect 492,"";
		percentheal 100,100;
		mes "[���{���Ïp�m]";
		mes "�����������܂����B";
		mes "���Â��K�v�ȍۂ�";
		mes "���ł����z�����������B";
		close;
	case 2:
		mes "[���{���Ïp�m]";
		mes "�ʒu�Z�[�u�͐퓬�s�\����";
		mes "�A�҂���ꏊ��";
		mes "���ݒn���ӂɍX�V����T�[�r�X�ł��B";
		mes "�����p�ɂȂ��܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���{���Ïp�m]";
			mes "�������܂�܂����B";
			mes "�T�[�r�X�������p�ɂȂ肽������";
			mes "���ł����z�����������B";
			close;
		}
		savepoint "pab_base01.gat",339,75;
		mes "[���{���Ïp�m]";
		mes "�L�^�������܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		close;
	case 3:
		mes "[���{���Ïp�m]";
		mes "��ԓ]���́A�������̌�₩��";
		mes "���I�т����������]�����";
		mes "�]�������Ă��������T�[�r�X�ł��B";
		mes "�����ł����p���������܂��B";
		next;
		switch(select("�v�����e���[��","�I�v�̋u","�v�����e��","���U�[�j��","��߂�")) {
		case 1:
			mes "[���{���Ïp�m]";
			mes "�������܂�܂����B";
			mes "����ł́u�v�����e���[���v��";
			mes "�]�������Ă��������܂��B";
			close2;
			warp "pab_camp.gat",41,186;
			end;
		case 2:
			mes "[���{���Ïp�m]";
			mes "�������܂�܂����B";
			mes "����ł́u�I�v�̋u�v��";
			mes "�]�������Ă��������܂��B";
			close2;
			warp "pab_castle.gat",279,232;
			end;
		case 3:
			mes "[���{���Ïp�m]";
			mes "�������܂�܂����B";
			mes "����ł́u�v�����e���v��";
			mes "�]�������Ă��������܂��B";
			close2;
			warp "prontera.gat",106,75;
			end;
		case 4:
			mes "[���{���Ïp�m]";
			mes "�������܂�܂����B";
			mes "����ł́u���U�[�j���v��";
			mes "�]�������Ă��������܂��B";
			close2;
			warp "lasagna.gat",298,238;
			end;
		case 5:
			mes "[���{���Ïp�m]";
			mes "�������܂�܂����B";
			mes "�T�[�r�X�������p�ɂȂ肽������";
			mes "���ł����z�����������B";
			close;
		}
	case 4:
		mes "[���{���Ïp�m]";
		mes "�e�탌���^���́A�J�[�g�Ȃǂ�";
		mes "�݂��o�����s���T�[�r�X�ł��B";
		mes "�����ł����p���������܂��B";
		next;
		mes "[���{���Ïp�m]";
		mes "�����c�c�B";
		mes "���q�l�̐E�Ƃ�";
		mes "�݂��o������̂��Ȃ��悤�ł��B";
		mes "�\���󂲂����܂���c�B";
		mes "���̃T�[�r�X�������p���������B";
		close;
	case 5:
		mes "[���{���Ïp�m]";
		mes "�������܂�܂����B";
		mes "�T�[�r�X�������p�ɂȂ肽������";
		mes "���ł����z�����������B";
		close;
	}
}
pab_base01.gat,355,98,4	script	�q�ɊǗ���#pab_base01	405,{/* 1010 */
	mes "[�q�ɊǗ���]";
	mes "^0000ff���C���q��^000000��";
	mes "^ff0000�T�u�q��^000000��";
	mes "^ff0000 40 Zeny^000000�ł��g�����������܂��B";
	mes "���񂲗��p���������B";
	close;
}
pab_base01.gat,352,96,6	script	���C���q��#pab_base01	464,{/* 1011 */}
pab_base01.gat,354,96,4	script	�T�u�q��1#pab_base01	464,{/* 1012 */}
pab_base01.gat,356,96,4	script	�T�u�q��2#pab_base01	464,{/* 1013 */}
pab_base01.gat,358,96,4	script	�T�u�q��3#pab_base01	464,{/* 1014 */}
pab_base01.gat,329,100,6	script	�Е����X����߉q��#pab_	470,{/* 1015 (hide)*/
	mes "[�Е����X����߉q��]";
	mes "�����܂ŒH�蒅�����Ƃ�";
	mes "�o����҂�����Ƃ́c�c";
	mes "����������B";
	next;
	mes "[�Е����X����߉q��]";
	mes "���ЁA��X�̍��ɋ��͊肢�����B";
	mes "�܂���^0000ff�u�����Ǘ����v^000000����";
	mes "�b�𕷂��Ă݂ė~�����B";
	mes "�ꏏ�ɐ킦�邱�ƁA�y���݂ɂ��Ă��邼�B";
	close;
}
pab_base01.gat,331,102,4	script	���Â��ȋ߉q��#pab_base	417,{/* 1016 (hide)*/
	mes "[���Â��ȋ߉q��]";
	mes "�c�c���ꂩ�玄�B��";
	mes "�[���̒n���x�z���閂����";
	mes "�ŏI����𒧂݂܂��B";
	next;
	mes "[���Â��ȋ߉q��]";
	mes "�h�G�ł��閂���𓢂����ɂ�";
	mes "��l�ł������̕��̋��͂��K�v�B";
	mes "������낵�����";
	mes "�߂��ɂ���^0000ff�u�����Ǘ����v^000000�̘b��";
	mes "�����Ă��������B";
	close;
}
pab_base01.gat,359,92,4	script	�d���Ȃ�߉q��#pab_base	734,{/* 1017 (hide)*/
	mes "[�d���Ȃ�߉q��]";
	mes "�M�a�͂��̒n�ł��w�܂��";
	mes "���̎҂Ƃ����󂯂���B";
	mes "����ȋM�a������";
	mes "�Q�����Ă��ꂽ��";
	mes "�ǂ�ȂɐS�������Ƃ��I";
	close;
}
pab_base01.gat,352,99,5	script	�]���Ȃ�߉q��#pab_base	413,{/* 1018 (hide)*/
	mes "[�]���Ȃ�߉q��]";
	mes "�P�l�̔ߊ�̐��A�܂�";
	mes "�����Ƃ����Ƃ���܂ŗ��܂����B";
	mes "�������A�����𓢂��łڂ��ɂ�";
	mes "�`���җl�̋��͂��s���ł��B";
	mes "���Ђ��͂����݂����������B";
	close;
}
pab_base01.gat,358,99,4	script	�E�܂����߉q��#pab_base	419,{/* 1019 (hide)*/
	mes "[�E�܂����߉q��]";
	mes "��킪���Ɏ��s�����B";
	mes "���̓����ǂ�Ȃ�";
	mes "�҂���тĂ��������c�c�B";
	next;
	mes "[�E�܂����߉q��]";
	mes "������̂āA�����炪��";
	mes "�������������J�̓��X��";
	mes "�悤�₭�I��点�邱�Ƃ��ł���B";
	close;
}
pab_base01.gat,335,84,4	script	�s��Ȃ�߉q��#pab_base	469,{/* 1020 (hide)*/
	mes "[�s��Ȃ�߉q��]";
	mes "�����܂ŒH�蒅����";
	mes "�M�a�̗͂�������ŁA���肢������B";
	mes "�ǂ������̍���";
	mes "�Q�����Ă������������B";
	next;
	mes "[�s��Ȃ�߉q��]";
	mes "�k�ɂ���^0000ff�u�����Ǘ����v^000000��";
	mes "�Q���҂����Ă���͂��B";
	mes "���Дނɐ��������ė~�����B";
	mes "��낵�����ށB";
	close;
}
pab_base01.gat,350,128,4	script	�s�������ȋ߉q��#pab_ba	413,{/* 1021 (hide)*/
	mes "[�s�������ȋ߉q��]";
	mes "���N���閧���Ɏ���i��";
	mes "���ɂ����܂ŗ��܂����B";
	mes "�����ȂƂ���";
	mes "���̖����ɏ��Ă鎩�M������܂���B";
	next;
	mes "[�s�������ȋ߉q��]";
	mes "�����̗͂��ԋ߂Ō���";
	mes "��������킩��̂ł��c�c�B";
	close;
}
pab_base01.gat,355,122,4	script	�C���Ɉ���߉q��#pab_	417,{/* 1022 (hide)*/
	mes "[�C���Ɉ���߉q��]";
	mes "�����͉΂ƕ��̖��@��";
	mes "���R���݂ɑ���ƕ����Ă��܂��B";
	mes "���ł����̗����N�����p�@��";
	mes "�΂ɑ΂����Ζh�䂷��";
	mes "�ł��j���Ă��܂��̂��Ƃ��c�c";
	mes "���낵���b�ł��B";
	close;
}
pab_base01.gat,346,127,6	script	���C����ȋ߉q��#pab_ba	415,{/* 1023 (hide)*/
	mes "[���C����ȋ߉q��]";
	mes "�`���җl�͖������������Ƃ�����܂����H";
	mes "�d���ȏ����̎p�����Ă��܂���";
	mes "���������̘b";
	mes "�l�Ԃł͂Ȃ��Ɖ\����Ă��܂��B";
	mes "�^�U�̂قǂ͕s���ł����c�c�B";
	next;
	mes "[���C����ȋ߉q��]";
	mes "�������ɁA�����̐��̂�";
	mes "�l�ԂłȂ��Ƃ��Ă�";
	mes "�������ׂ�����ɂ͈Ⴂ����܂���B";
	mes "������Ɏ��A�키�݂̂ł��B";
	close;
}
pab_base01.gat,326,127,8	script	���^�ʖڂȋ߉q��#pab_ba	751,{/* 1024 (hide)*/
	mes "[���^�ʖڂȋ߉q��]";
	mes "�߉q���̒��ł��A���ɏG�ł��\�͂�����";
	mes "�M���������l�l��";
	mes "�u�l�R�m�v�ƌĂ΂�";
	mes "�P�l���璼�ځA�w�߂��󂯂�";
	mes "�����Ă��邻���ł��B";
	next;
	mes "[���^�ʖڂȋ߉q��]";
	mes "�����C����ς�";
	mes "�����͎l�R�m�̈�l�Ƃ���";
	mes "�P�l�̂��͂ɂȂ肽�����̂ł��B";
	close;
}
pab_base01.gat,332,133,4	script	���z�̗ǂ��߉q��#pab_ba	414,{/* 1025 (hide)*/
	mes "[���z�̗ǂ��߉q��]";
	mes "�����S���Ȃ�";
	mes "�邪���̑��A�Ɖ�������";
	mes "���������Ă��ꂽ�̂��P�l�Ȃ̂ł��B";
	next;
	mes "[���z�̗ǂ��߉q��]";
	mes "�P�l�ɏ����Ă����Ȃ����";
	mes "��X�͐����Ă͂��܂���ł����B";
	mes "�ł�����A��X�͕P�l�̂��߂�";
	mes "�����g�����ƂɌ��߂��̂ł��B";
	close;
}
pab_base01.gat,330,126,7	script	�킵���߉q��#pab_base01	745,{/* 1026 (hide)*/
	mes "[�킵���߉q��]";
	mes "���������킢���n�܂�܂��c�c";
	mes "���B�͏��Ă�̂ł��傤���H";
	mes "����Ȏ��A�a�������Ă��ꂽ��";
	mes "�ǂ�ȂɐS�������c�c�B";
	close;
}
pab_base01.gat,346,93,4		script	������#pab_base01_01	10252,{/* 1027 (hide)*/}
pab_base01.gat,331,100,4	script	������#pab_base01_02	10252,{/* 1028 (hide)*/}
pab_base01.gat,351,120,4	script	������#pab_base01_03	10252,{/* 1029 (hide)*/}
pab_base01.gat,353,124,4	script	������#pab_base01_04	10252,{/* 1030 (hide)*/}
pab_base01.gat,348,127,4	script	������#pab_base01_05	10252,{/* 1031 (hide)*/}
pab_base01.gat,332,131,4	script	������#pab_base01_06	10252,{/* 1032 (hide)*/}
pab_base01.gat,332,128,4	script	������#pab_base01_07	10252,{/* 1033 (hide)*/}
pab_base01.gat,325,130,4	script	������#pab_base01_08	10252,{/* 1034 (hide)*/}
pab_base01.gat,348,99,4		script	��n�]��#pab_base01	406,{/* 1035 */}

/*
@spawn(type: BL_MOB, ID: 3457, speed: 2000, option: 4, view: 3871, pos: "pab_base01.gat"(267, 56), dir: 0, name: "")
@spawn(type: BL_MOB, ID: 3458, speed: 2000, option: 4, view: 3871, pos: "pab_base01.gat"(267, 63), dir: 0, name: "")
@spawn(type: BL_MOB, ID: 3459, speed: 2000, option: 4, view: 3871, pos: "pab_base01.gat"(267, 70), dir: 0, name: "")
@spawn(type: BL_MOB, ID: 3460, speed: 2000, option: 4, view: 3871, pos: "pab_base01.gat"(267, 77), dir: 0, name: "")
@spawn(type: BL_MOB, ID: 3461, speed: 2000, option: 4, view: 3871, pos: "pab_base01.gat"(267, 84), dir: 0, name: "")
@spawn(type: BL_MOB, ID: 3462, speed: 2000, option: 4, view: 3871, pos: "pab_base01.gat"(267, 91), dir: 0, name: "")
@spawn(type: BL_MOB, ID: 3463, speed: 2000, option: 4, view: 3871, pos: "pab_base01.gat"(267, 98), dir: 0, name: "")
*/