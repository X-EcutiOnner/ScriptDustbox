//====================================================================
//Ragnarok Online - lasagna Town Script	by refis
//====================================================================

//------------------------------------------------------------
// Spawn data
//------------------------------------------------------------
// lasa_fild01.gat
lasa_fild01.gat,100,320,75,55	monster	�G�b�O����			3495,15,5000,0,1
lasa_fild01.gat,100,320,75,55	monster	�O���X�t�@�u��		3497,6,5000,0,1
lasa_fild01.gat,100,320,75,55	monster	���[�t���i�e�B�b�N	3496,6,5000,0,1
lasa_fild01.gat,0,0,0,0		monster	�G�b�O����			3495,80,5000,0,1
lasa_fild01.gat,0,0,0,0		monster	�O���X�t�@�u��		3497,110,5000,0,1
lasa_fild01.gat,0,0,0,0		monster	���[�t���i�e�B�b�N	3496,110,5000,0,1
lasa_fild01.gat,0,0,0,0		monster	�r�b�O�G�b�O����	3505,1,5400000,1800000,1
//------------------------------------------------------------
// lasa_fild02.gat
lasa_fild02.gat,0,0,0,0	monster	���C���h�z�[�l�b�g	3498,90,5000,0,0
lasa_fild02.gat,0,0,0,0	monster	�X�E�B�[�g�t���b�O	3499,100,5000,0,0
lasa_fild02.gat,0,0,0,0	monster	�n���^�[�E���t		3500,100,5000,0,0
lasa_fild02.gat,0,0,0,0	monster	��@�o�W�����X�N	3502,10,5000,0,0
//------------------------------------------------------------
// lasa_dun01.gat
lasa_dun01.gat,0,0,0,0	monster	�g�����X�X�|�A		3501,30,5000,0,0
lasa_dun01.gat,0,0,0,0	monster	��@�o�W�����X�N	3502,60,5000,0,0
//------------------------------------------------------------
// lasa_dun02.gat
lasa_dun02.gat,0,0,0,0	monster	�ˌ��ԃo�W�����X�N	3503,195,5000,0,0
lasa_dun02.gat,0,0,0,0	monster	�W�����O���}���h���S��	3506,30,5000,0,0
//------------------------------------------------------------
// lasa_dun03.gat
lasa_dun03.gat,0,0,0,0	monster	�ˌ��΃o�W�����X�N	3504,240,5000,0,0
lasa_dun03.gat,0,0,0,0	monster	�t���[�c�|���X�p�C�_�[	3507,60,5000,0,0

//------------------------------------------------------------
// Monster data
//------------------------------------------------------------
// name: "�G�b�O����" speed: 400, view: 3495
// noskill
// name: "���[�t���i�e�B�b�N" speed: 200, view: 3496
// noskill
// name: "�O���X�t�@�u��" speed: 400, view: 3497
// noskill
// name: "���C���h�z�[�l�b�g" speed: 150, view: 3498
// 3498,���C���h�z�[�l�b�g���s�A�[�V���O�A�^�b�N,attack,158,2,500,0,5000,yes,target,always,0,,,,,,6
// 3498,���C���h�z�[�l�b�g���E�B���h�A�^�b�N,attack,187,2,2000,0,5000,yes,target,always,0,,,,,,
// name: "�X�E�B�[�g�t���b�O" speed: 200, view: 3499
// 3499,�X�E�B�[�g�t���b�O���E�H�[�^�[�A�^�b�N,attack,184,2,2000,0,5000,yes,target,always,0,,,,,,
// name: "�n���^�[�E���t" speed: 300, view: 3500
// 3500,�n���^�[�E���t���G���[�V����,walk,197,1,2000,0,5000,yes,self,always,0,2,,,,,
// 3500,�n���^�[�E���t���t�@�C�A�[�A�^�b�N,attack,186,1,2000,0,5000,yes,target,always,0,,,,,,
// name: "�g�����X�X�|�A" speed: 200, view: 3501
// 3501,�g�����X�X�|�A���G���[�V����,idle,197,1,2000,0,5000,yes,self,always,0,1,,,,,
// 3501,�g�����X�X�|�A���v���{�P�C�V����,chase,194,1,200,0,5000,yes,self,always,0,,,,,,19
// 3501,�g�����X�X�|�A���X���[�v�A�^�b�N,attack,182,1,500,0,5000,yes,target,always,0,,,,,,
// 3501,�g�����X�X�|�A���E�H�[�^�[�A�^�b�N,attack,184,1,2000,0,5000,yes,target,always,0,,,,,,
// name: "��@�o�W�����X�N" speed: 300, view: 3502
// noskill
// name: "�ˌ��ԃo�W�����X�N" speed: 250, view: 3503 amotion: 2245
// 3503,�ˌ��ԃo�W�����X�N�����b�V���A�^�b�N,idle,349,2,1000,0,30000,yes,self,always,0,,,,,,32
// 3503,�ˌ��ԃo�W�����X�N���R���{�A�^�b�N,attack,171,3,500,0,5000,yes,target,always,0,,,,,,
// 3503,�ˌ��ԃo�W�����X�N���X�^���A�^�b�N,attack,179,2,500,700,5000,no,target,always,0,,,,,,
// name: "�ˌ��΃o�W�����X�N" speed: 250, view: 3504
// 3504,�ˌ��΃o�W�����X�N�����b�V���A�^�b�N,idle,349,2,1000,0,30000,yes,self,always,0,,,,,,32
// 3504,�ˌ��΃o�W�����X�N���R���{�A�^�b�N,attack,171,3,500,0,5000,yes,target,always,0,,,,,,
// 3504,�ˌ��΃o�W�����X�N���X�^���A�^�b�N,attack,179,2,500,700,5000,no,target,always,0,,,,,,
// name: "�r�b�O�G�b�O����" 400,1889,672,462
// 3505,�r�b�O�G�b�O�������u���b�h�h���C��,attack,199,1,2000,0,5000,yes,target,always,0,,,,,,
// 3505,�r�b�O�G�b�O�������G���[�V����,idle,197,1,500,0,30000,yes,self,always,0,2,,,,,
// 3505,�r�b�O�G�b�O�������A�W���e�B�A�b�v,idle,350,4,10000,0,10000,yes,self,always,0,,,,,,
// 3505,�r�b�O�G�b�O�������T�����X���C�u,attack,196,4,10000,2000,60000,no,self,slavele,0,3508,,,,,
// 3505,�r�b�O�G�b�O�������T�����X���C�u,idle,196,4,10000,2000,60000,no,self,slavele,0,3508,,,,,
// name: "�W�����O���}���h���S��" speed: 1000, view: 3506
// 3506,�W�����O���}���h���S�����O���E���h�A�^�b�N,attack,185,1,2000,0,5000,yes,target,always,0,,,,,,
// name: "�t���[�c�|���X�p�C�_�[" speed: 250, view: 3507
// 3507,�t���[�c�|���X�p�C�_�[���|�C�Y���u���[,attack,176,2,500,800,5000,no,target,always,0,,,,,,
// 3507,�t���[�c�|���X�p�C�_�[���X�p�C�_�[�E�F�u,idle,405,1,3000,0,10000,yes,anothertarget,always,0,,,,,,
// 3507,�t���[�c�|���X�p�C�_�[���X�p�C�_�[�E�F�u,attack,405,1,2000,0,10000,yes,target,always,0,,,,,,
// 3507,�t���[�c�|���X�p�C�_�[���|�C�Y���A�^�b�N,attack,188,1,500,0,5000,yes,target,always,0,,,,,,
// 3507,�t���[�c�|���X�p�C�_�[���x�i���_�X�g,angry,140,1,500,1500,5000,no,target,always,0,,,,,,
// 3507,�t���[�c�|���X�p�C�_�[���N�@�O�}�C�A,chase,92,5,500,700,5000,yes,target,always,0,,,,,,12
// 3507,�t���[�c�|���X�p�C�_�[���u���[�f�B���O�A�^�b�N,attack,660,2,1000,0,3000,yes,target,always,0,,,,,,32
// name: "�G�b�O����" speed: 400, view: 3508

/*
lasagna.gat,141,249,4	script	���폤�l�u���[�g#blutnp	10158,{
	if(!checkquest(98999)) {
		mes "[���폤�l�u���[�g]";
		mes "��������Ⴂ�B";
		mes "�����͉���T���Ă���񂾂��H";
		next;
		menu "�Ȃ���ɓ����Ă���̂��q�˂�",-;
		mes "[���폤�l�u���[�g]";
		mes "�����c�c���ꂩ���B";
		mes "���͉��A���������Ă��̂�";
		mes "��@�o�W�����X�N�E�ł�";
		mes "�����Ẵ����ŁA";
		mes "���������u�C�u�C";
		mes "���킹�Ă����񂾂�B";
		next;
		mes "[���폤�l�u���[�g]";
		mes "�Ƃ��낪������A������Ƃւ܂�";
		mes "��炩�����܂��ĂˁB";
		mes "�����Ŏ��x�c�ɕ߂܂��Ĉȗ��A";
		mes "�����Ƃ��̎p���B";
		next;
		mes "[���폤�l�u���[�g]";
		mes "�ł��A���������������";
		mes "��������ƍX�����āA";
		mes "���ł͂��������";
		mes "�X������Ă���񂾁B";
		next;
		mes "[���폤�l�u���[�g]";
		mes "�N�����l�Ԃ̓~�b�h�K���h�嗤����";
		mes "�����񂾂�ˁH";
		mes "�l�͖��H�O�����A�X��";
		mes "������W�߂Ă���񂾂��ǁA";
		mes "���������Ă�����l�̔鑠�̕����";
		mes "�������Ă���Ȃ������H";
		next;
		mes "[���폤�l�u���[�g]";
		mes "���Ȃ݂ɁA�A���F���W���[��";
		mes "����ł����Ȃ���B";
		mes "������ƍ����񂶂���Ă邯�ǁA";
		mes "���̓O�����A�X�̕��킾����ˁB";
		next;
		select("��������:����c�ɐU��")
		setquest 98999;
		compquest 98999;
		mes "[���폤�l�u���[�g]";
		mes "�ق�ƂɁH";
		mes "����`�������B";
		mes "�������ɂ���ƂȂ��Ȃ�";
		mes "��ɓ���Ȃ��ĂˁB";
		next;
		mes "[���폤�l�u���[�g]";
		mes "�l�̔鑠�̃R���N�V������";
		mes "���X�̕i������";
		mes "�����ƌN�������ł���Ǝv����B";
		next;
		mes "[���폤�l�u���[�g]";
		mes "���͎����Ŏg���Ă݂悤�Ƃ�";
		mes "�v�����񂾂��ǁA";
		mes "�l����g�����Ȃ��Ȃ������񂾁B";
		mes "�ł��O�����A�X�����";
		mes "��ɓ������悤�Ȗ`���҂�";
		mes "�N�Ȃ炫���Ǝg�����Ȃ����I";
	}
	else {
		mes "[���폤�l�u���[�g]";
		mes "��������Ⴂ�B";
		mes "�u���[�g����̌���������]�����H";
	}
	next;
	switch(select("����̌���:������̐��\������:�����̑Ή����X�g������:��߂�")) {
	case 4:
		mes "[���폤�l�u���[�g]";
		mes "���������A�c�O���ˁB";
		mes "�܂��K�v�ɂȂ�����";
		mes "���������Ă�����B";
		close;
	}
}
*/

lasagna.gat,323,229,4	script	���x�c���I���I#do_su01	10155,{}
lasagna.gat,318,229,4	script	�W���h�E#do_su02	10159,{}
lasagna.gat,313,229,3	script	�p�t�[��#do_su02	735,{}
lasagna.gat,328,229,4	script	�V�o#do_su02	10160,{}
lasagna.gat,300,242,4	script	�J�v���E��#lasagna	117,5,5,{
	cutin "kafra_01",2;
	setarray '@code,1,2,20;
	setarray '@price,0,0,0;
	callfunc "KafraMain",1,0x1df,"lasagna.gat",298,239,"NULL",0,0,0,800,'@code,'@price;
	close2;
	cutin "kafra_01",255;
	end;
OnTouch:
	if(DORAM_1QUE == 100) {
		cutin "kafra_01.bmp", 2;
		mes "[�J�v���E��]";
		mes "�h�����̐V�Ė`���҂���A";
		mes "����ɂ��́B";
		mes "������̓J�v���T�[�r�X�ł��B";
		set DORAM_1QUE,0;
		next;
		cutin "kafra_01.bmp", 255;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�e�n�ɂ���J�v���T�[�r�X�ł�";
		mes "�ʒu�Z�[�u�T�[�r�X��";
		mes "�q�ɃT�[�r�X�A";
		mes "��Ԉړ��T�[�r�X�ȂǁA";
		mes "�`���ɕK�v�ȃT�|�[�g��";
		mes "�󂯂邱�Ƃ��ł��܂��B^000000";
		next;
		cutin "do_su_025.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�q�ɃT�[�r�X�͏������Ă���";
		mes "�A�C�e����q�ɂɗa���邱�Ƃ�";
		mes "�ł��܂��B";
		mes "�a�����A�C�e���͎�ʂ��Ƃ�";
		mes "�^�u�ɕ������ĕۊǂ���܂��B^000000";
		next;
		cutin "do_su_026.bmp", 3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�q�ɂɗa�����A�C�e����";
		mes "�ʂ̏ꏊ�̑q�ɂ����";
		mes "���o�����Ƃ��ł��܂��B";
		mes "�܂��A�����A�J�E���g����";
		mes "�ʂ̃L�����N�^�[��";
		mes "���o�����Ƃ��ł��܂��B^000000";
		next;
		cutin "kafra_01.bmp", 2;
		mes "[�J�v���E��]";
		mes "���x�c�̃I���I����";
		mes "�V�Ė`���҂��񂪗�����";
		mes "�����̂Ƃ���ɗ���悤��";
		mes "�`���ė~�����ƌ����Ă��܂����B";
		next;
		mes "[�J�v���E��]";
		mes "�I���I�����";
		mes "��������쓌�̍L��ɂ��܂��B";
		mes "����̖`���̕��@�ɂ���";
		mes "���N�`���[����Ƃ̂��Ƃł��̂ŁA";
		mes "���ډ���Ă��b�𕷂��Ă݂Ă�";
		mes "�������ł��傤���H";
		next;
		cutin "kafra_01.bmp", 255;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�쓌�̍L��ɂ���";
		mes "�I���I�ɘb�������܂��傤�I^000000";
		//setquest 98440;
		//compquest 98440;
		viewpoint 1, 323, 229, 1, 0xFF0000;
		close;
	}
	end;
}
lasagna.gat,305,242,4	script	���Ît�n��#lasagna	10164,{
	set '@price,5000;

	mes "[���Ît�n��]";
	if(Job == Job_Summoner) {
		mes "�₠�B���q�͂ǂ������H";
		mes "���ÂȂ�C���Ă����B";
		if(BaseLevel < 100) {
			mes "���܂Ȃ�BaseLv100�ȉ���";
			mes "�V�ăh�����͖�����";
			mes "���Â��Ă������B";
			set '@price,0;
		}
	}
	else {
		mes "�p�[�X�^�嗤�ւ悤�����I";
		mes "���̓��U�[�j���B��̎��Ît��";
		mes "�n���ƌ����܂��B";
	}
	next;
	if(select("���S�񕜂𗊂ށ@^0000FF" +'@price+ "Zeny^000000","��߂�") == 2) {
		mes "[���Ît�n��]";
		mes "�܂��̂����p��";
		mes "���҂����Ă���܂��B";
		close;
	}
	if(Zeny < '@price) {
		mes "[���Ît�n��]";
		mes "����c�c�H";
		mes "����������Ȃ��悤�ł��ˁB";
		mes "���Âɂ���p���K�v�ł��B";
		mes "�ǂ������������c�c�B";
		close;
	}
	misceffect 7,"";
	misceffect 14,"";
	misceffect 492,"";
	percentheal 100,100;
	npcskillsupport 28,9999;
	set Zeny,Zeny - '@price;
	mes "[���Ît�n��]";
	if(Job == Job_Summoner) {
		mes "�ӂ��A�I�������B";
		mes "���Â��K�v�ɂȂ�����";
		mes "�܂����Ă��������ˁB";
	}
	else {
		mes "���Â��I���܂����B";
		mes "�܂��̂����p��";
		mes "���҂����Ă��܂��B";
	}
	close;
}
lasagna.gat,346,249,4	script	���e�t�����J�[#lasagna	10166,{
	mes "[���e�t�����J�[]";
	mes "���̃n�T�~�̓h������p��I";
	mes "�l�Ԃ͐��̐l�ɂ��肢���Ē��Ձ`�B";
	close;
}
lasagna.gat,312,259,5	shop	����l#lasagna	553,11602,515,567,601,602,610,656,525,611
lasagna.gat,293,289,5	script	����l#do_su03	10162,{}
lasagna.gat,298,289,5	script	���H�E�l#do_su03	555,{}
lasagna.gat,289,287,5	script	�b��E�l#lasagna	561,{}
lasagna.gat,346,244,6	script	�X�y�V�����A�C�e���̔�	73,{}
lasagna.gat,321,242,4	script	�Ŕ�#1lasagna	835,7,7,{
	unittalk "�k�����F����l�@�^�@�����F���^�ύX�E�X�y�V�����A�C�e���̔���",1;
	end;
}
lasagna.gat,312,251,4	script	�Ŕ�#2lasagna	835,7,7,{
	unittalk "�k�����F���B�E�C���E�h��������̔��E�A�b�v�O���[�h",1;
	end;
}
lasagna.gat,297,229,4	script	�`���[�g���A���f����#01	857,{
	mes "�]�`���[�g���A���Ŋw�񂾂��Ƃ�";
	mes "�@�m�F�ł���f�����B";
	mes "�@�ǂ��ǂ݂܂����]";
	while(1) {
		next;
		switch(select("��߂�","���N���b�N","�N�G�X�g�E�B���h�E","�~�j�}�b�v�ƌ��ݒn�̊m�F","�A�C�e���E�B���h�E","�A�C�e���̐��B","�X�e�[�^�X","�X�L��","�V���[�g�J�b�g�E�B���h�E","���R�񕜂Əd��","�A�C�e���̍w���Ɣ��p","�N�G�X�g�E�B���h�E�ɒ��ړ���A�C�e��","���[�v�����N","�p�[�e�B�[����","�v���C���[�Ƃ̎��","�J�v���T�[�r�X")) {
		case 1:		//��߂�
			cutin "do_su_001.bmp", 255;
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		case 2:		//���N���b�N
			cutin "do_su_001.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�}�E�X�̃N���b�N�ŃQ�[������";
			mes "�e��C���^�[�t�F�[�X�𑀍�o���܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "NPC�Ƃ̉�b��ړ��A�����X�^�[�ւ̍U����";
			mes "�}�E�X�̍��N���b�N���g�p���܂��B";
			continue;
		case 3:		//�N�G�X�g�E�B���h�E
			cutin "do_su_002.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�N�G�X�g�E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<U>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			next;
			cutin "do_su_003.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�N�G�X�g�E�B���h�E�ɂ�";
			mes "�s�����ڕW�������Ă���܂��B";
			mes "�܂��͂�����ڎw���܂��傤�I";
			continue;
		case 4:		//�~�j�}�b�v�ƌ��ݒn�̊m�F
			cutin "do_su_001.bmp", 255;
			mes "�y�C���t�H���[�V�����z";
			mes "��ʉE��̃~�j�}�b�v��";
			mes "�����̍�����ꏊ����W��";
			mes "�\������Ă��܂��B";
			next;
			cutin "do_su_028.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�܂��A�`���b�g�E�B���h�E��";
			mes "^ff0000�u/where�v^000000�Ɠ��͂����";
			mes "�����̂���}�b�v����";
			mes "���ׂ邱�Ƃ��ł��܂��B";
			continue;
		case 5:		//�A�C�e���E�B���h�E
			cutin "do_su_004.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�A�C�e���E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<E>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			next;
			cutin "do_su_018.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "���Ճ^�u�̃A�C�e����";
			mes "�_�u���N���b�N����ƁA";
			mes "�A�C�e�����g�p���邱�Ƃ�";
			mes "�ł��܂��B";
			next;
			cutin "do_su_005.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�������Ă���A�C�e����";
			mes "�����E�B���h�E�Ŋm�F�ł��܂��B";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<Q>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			next;
			cutin "do_su_006.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�����^�u�̃A�C�e����";
			mes "�_�u���N���b�N����ƁA";
			mes "�A�C�e���𑕔����邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�_�u���N���b�N�ȊO�ɂ��A";
			mes "�A�C�e���E�B���h�E����";
			mes "�����������A�C�e����";
			mes "�����E�B���h�E��";
			mes "�h���b�O���h���b�v���鎖�ŁA";
			mes "������ύX���邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�������A���������J���Ă��Ȃ�����";
			mes "�h���b�O���h���b�v��";
			mes "�n�ʂ��w�肷���";
			mes "�A�C�e���𗎂Ƃ��Ă��܂��̂�";
			mes "���ӂ��Ă��������B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�h���b�v���b�N�{�^����������";
			mes "���b�N��Ԃɂ���Βn�ʂ�";
			mes "�A�C�e�����̂Ă��邱�Ƃ͂Ȃ��Ȃ�܂��B";
			mes "�S�z�Ȑl�̓��b�N��Ԃ�";
			mes "���Ă����܂��傤�B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ��ANPC�Ɖ�b���̓A�C�e����";
			mes "�g�p�ł��Ȃ��ꍇ������̂�";
			mes "���ӂ��Ă��������I";
			continue;
		case 6:		//�A�C�e���̐��B
			cutin "do_su_023.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�����𐸘B���邱�Ƃ�";
			mes "�����h��̐��\��";
			mes "�㏸�����邱�Ƃ��ł��܂��B";
			mes "���B�ɕK�v�Ȕ�p��f�ނ�";
			mes "�A�C�e���ɂ���ĈقȂ�܂��B";
			next;
			cutin "do_su_024.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "����̐��B�l�𒴂��Đ��B����ƁA";
			mes "���B�Ɏ��s���邱�Ƃ�����܂��B";
			mes "���S�Ȑ��B�l�͑����ɂ���ĈقȂ�A";
			mes "^ff0000���B�Ɏ��s�����A�C�e����";
			mes "�������Ă��܂��̂�";
			mes "�C�����Ă��������I^000000";
			continue;
		case 7:		//�X�e�[�^�X
			cutin "do_su_007.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X��6��ނ���܂��B";
			mes "���ꂼ��̓�����";
			mes "��������Ɣc�����Ă����܂��傤�I";
			next;
			cutin "do_su_008.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X�E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<A>�L�[^000000��";
			mes "�ŊJ�����Ƃ��ł��܂��B";
			mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I";
			next;
			cutin "do_su_009.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�����N���b�N�����";
			mes "Status Point������A";
			mes "�X�e�[�^�X���㏸���܂��B";
			mes "Status Point��BaseLv��";
			mes "�オ�邲�Ƃɑ����܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "��x�����Status Point��";
			mes "�߂����Ƃ��ł��܂���B";
			mes "�ԈႦ�ĕʂ̃X�e�[�^�X��";
			mes "�|�C���g���g�p���Ȃ��悤��";
			mes "�C��t���܂��傤�B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X��";
			mes "�u+���v�Ƃ���������";
			mes "������JobLv�ɂ��";
			mes "�X�e�[�^�X�{�[�i�X�ł��B";
			mes "Status Point�������";
			mes "�㏸�͂����邱�Ƃ͂ł��܂���B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�e�[�^�X�̏グ�������";
			mes "�����X�^�[�Ƃ̐킢����";
			mes "�傫���ς��܂��B";
			mes "�����ɍ������X�e�[�^�X��";
			mes "�T���Ă݂܂��傤�B";
			continue;
		case 8:		//�X�L��
			cutin "do_su_001.bmp", 255;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�L���͐E�Ɩ��ɈقȂ�";
			mes "�T���i�[�̐E�Ƃ�";
			mes "�U����񕜁A�⏕�̃X�L����";
			mes "�o���邱�Ƃ��ł��܂��B";
			next;
			cutin "do_su_010.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�X�L���E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<S>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			mes "�܂��̓E�B���h�E���J���Ă݂܂��傤�I";
			next;
			cutin "do_su_011.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�K���������X�L�������N���b�N��";
			mes "�m��{�^���������āA";
			mes "�m�F�ɓ��ӂ���ƃX�L���|�C���g��";
			mes "����ăX�L�����K�����܂��B";
			mes "�X�L���|�C���g��JobLv��";
			mes "1�オ�邲�Ƃ�1�|�C���g�����܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "��x������X�L���|�C���g��";
			mes "�߂����Ƃ��ł��܂���B";
			mes "�ԈႦ�ĕʂ̃X�L����";
			mes "�|�C���g���g�p���Ȃ��悤��";
			mes "�C��t���܂��傤�B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ��A�X�L���̒��ɂ͊o���邽�߂�";
			mes "������������̂�����܂��B";
			mes "�Ⴆ�΁u���݂��v���K������ɂ�";
			mes "�u�h������{�X�L���vLv1��";
			mes "�K�����Ă���K�v������܂��B";
			next;
			cutin "do_su_010.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�܂��A^ff0000�N�G�X�g��B�����邱�Ƃ�";
			mes "�K���ł���X�L��������A";
			mes "�N�G�X�g�X�L���Ƃ����܂��B^000000";
			mes "�N�G�X�g�X�L���̓X�L���|�C���g��";
			mes "������Ɋo���邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�K������X�L�������";
			mes "�����X�^�[�Ƃ̐킢����";
			mes "�傫���ς��܂��B";
			mes "�����ɍ������X�L����";
			mes "�T���Ă݂܂��傤�B";
			continue;
		case 9:		//�V���[�g�J�b�g�E�B���h�E
			cutin "do_su_027.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "^ff0000<Ctrl>�L�[+<F12>�L�[^000000��";
			mes "�J�����Ƃ��ł��܂��B";
			mes "�V���[�g�J�b�g�E�B���h�E��<F12>�L�[��";
			mes "�؂�ւ��邱�Ƃ��ł��A";
			mes "�ő��4�܂œo�^�ł��܂��B";
			next;
			cutin "do_su_012.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�V���[�g�J�b�g�E�B���h�E��";
			mes "�X�L����A�C�e����";
			mes "�h���b�O���h���b�v���邱�Ƃ�";
			mes "�o�^�ł��܂��B";
			next;
			cutin "do_su_013.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�o�^�����X�L����A�C�e����";
			mes "�Ή������t�@���N�V�����L�[��";
			mes "�������ƂŁA";
			mes "�������g�p���邱�Ƃ��ł��܂��B";
			continue;
		case 10:		//���R�񕜂Əd��
			cutin "do_su_014.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "HP��SP�͎��Ԃ��o�Ă�";
			mes "���R�ɉ񕜂��܂����A";
			mes "���邱�Ƃŉ񕜂��鑬�x��";
			mes "���߂邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�u���v�Ɓu����v��^ff0000<Insert>�L�[^000000��";
			mes "�؂�ւ��邱�Ƃ��ł��܂��B";
			next;
			cutin "do_su_015.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ������A�C�e���̏d�ʂ�";
			mes "���d�ʂ�50%�ȏ�ɂȂ��";
			mes "���R�񕜂��������Ȃ��Ȃ�܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�����90%�ȏ�ɂȂ�ƁA";
			mes "�ʏ�U����X�L���U����";
			mes "�ł��Ȃ��Ȃ�܂��B";
			mes "���������Ȃ��Ă��܂�����";
			mes "�A�C�e�����̂Ă���q�ɂɗa����";
			mes "�d�ʂ����炵�܂��傤�I";
			continue;
		case 11:		//�A�C�e���̍w���Ɣ��p
			cutin "do_su_016.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�A�C�e����NPC�ɔ��p�����";
			mes "Zeny�ɂȂ�܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���p�������A�C�e����";
			mes "�u���肽���i���v�Ɉړ����A";
			mes "���p������͂��Ă���";
			mes "[sell]���N���b�N�����";
			mes "�A�C�e���𔄋p�ł��܂��B";
			next;
			cutin "do_su_017.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "���l���̔����Ă���A�C�e����";
			mes "Zeny���x�������Ƃ�";
			mes "�w�����邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�w���������A�C�e����";
			mes "�u���������i���v�Ɉړ����A";
			mes "�w��������͂��Ă���";
			mes "[buy]���N���b�N�����";
			mes "�A�C�e�����w���ł��܂��B";
			continue;
		case 12:		//�N�G�X�g�E�B���h�E�ɒ��ړ���A�C�e��
			cutin "do_su_019.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�ʏ�A�A�C�e���̓����X�^�[��";
			mes "�|�����ۂɒn�ʂɃh���b�v���܂����A";
			mes "�N�G�X�g�ɂ���Ă͑Ώۂ̃A�C�e����";
			mes "���ڃA�C�e���E�B���h�E��";
			mes "����ꍇ������܂��B";
			continue;
		case 13:		//���[�v�����N
			cutin "do_su_020.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "���[�v�����N�ɐG����";
			mes "�ʂ̃}�b�v�Ɉړ��ł��܂��B";
			continue;
		case 14:		//�p�[�e�B�[����
			cutin "do_su_021.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�p�[�e�B�[�E�B���h�E��";
			mes "�A�C�R�������N���b�N���邩";
			mes "^ff0000<Alt>�L�[+<Z>�L�[^000000��";
			mes "�ŊJ�����Ƃ��ł��܂��B";
			mes "�J������u�p�[�e�B�[�쐬�v��";
			mes "�p�[�e�B�[������Ă݂܂��傤�I";
			next;
			cutin "do_su_022.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�p�[�e�B�[�������߂�";
			mes "�p�[�e�B�[���������A";
			mes "���̃v���C���[���E�N���b�N�����";
			mes "�u�p�[�e�B�[�����v���v��";
			mes "���邱�Ƃ��ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���肪�p�[�e�B�[�v�������F����ƁA";
			mes "�p�[�e�B�[�ɓ���邱�Ƃ��ł��܂��B";
			mes "���F�B��U���ăp�[�e�B�[��";
			mes "�g��ł݂܂��傤�I";
			continue;
		case 15:		//�v���C���[�Ƃ̎��
			cutin "do_su_029.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�v���C���[���m��";
			mes "�A�C�e����Zeny�̎����";
			mes "�������ꍇ�́A";
			mes "���̃v���C���[���E�N���b�N����";
			mes "�u����v���v��I��ł��������B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���肪�v���ɉ�����ƁA";
			mes "�A�C�e�������E�B���h�E��";
			mes "�J���܂��B";
			mes "����������������ɓn�����́A";
			mes "�E�������肪�����ɓn�����̂�";
			mes "�Ȃ�܂��B";
			next;
			cutin "do_su_030.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�������n���A�C�e����";
			mes "Zeny�̊z�����肵����A";
			mes "�����́uOK�v���N���b�N���܂��B";
			mes "����Ǝ����̗����D�F�ɂȂ�܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "���葤���n���A�C�e����";
			mes "Zeny�̊z�����肷��ƁA";
			mes "���葤�̗����D�F�ɂȂ�܂��B";
			mes "���݂��̗����D�F�ɂȂ�����";
			mes "�����́utrade�v���N���b�N�����";
			mes "������������܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ȃ��A���������̂��ԈႦ����A";
			mes "����̓��e���C�ɓ���Ȃ��ꍇ��";
			mes "�utrade�v�������O��";
			mes "�E���́ucancel�v��������";
			mes "����𒆎~�ł��܂��B";
			next;
			mes "�y�C���t�H���[�V�����z";
			mes "�Ӑ}���Ȃ��A�C�e����Zeny��";
			mes "�n���Ă��܂�Ȃ��悤�A";
			mes "������s���ۂɂ�";
			mes "�\�����ӂ��܂��傤�B";
			continue;
		case 16:		//�J�v���T�[�r�X
			cutin "kafra_01.bmp", 255;
			mes "�y�C���t�H���[�V�����z";
			mes "�e�n�ɂ���J�v���T�[�r�X�ł�";
			mes "�ʒu�Z�[�u�T�[�r�X��";
			mes "�q�ɃT�[�r�X�A";
			mes "��Ԉړ��T�[�r�X�ȂǁA";
			mes "�`���ɕK�v�ȃT�|�[�g��";
			mes "�󂯂邱�Ƃ��ł��܂��B";
			next;
			cutin "do_su_025.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�q�ɃT�[�r�X�͏������Ă���";
			mes "�A�C�e����q�ɂɗa���邱�Ƃ�";
			mes "�ł��܂��B";
			mes "�a�����A�C�e���͎�ʂ��Ƃ�";
			mes "�^�u�ɕ������ĕۊǂ���܂��B";
			next;
			cutin "do_su_026.bmp", 3;
			mes "�y�C���t�H���[�V�����z";
			mes "�q�ɂɗa�����A�C�e����";
			mes "�ʂ̏ꏊ�̑q�ɂ����";
			mes "���o�����Ƃ��ł��܂��B";
			mes "�܂��A�����A�J�E���g����";
			mes "�ʂ̃L�����N�^�[��";
			mes "���o�����Ƃ��ł��܂��B";
			continue;
		}
	}
}
lasagna.gat,235,198,5	script	�y�����c��#lasagna	10152,{
	mes "[�y�����c��]";
	if(Job == Job_Summoner) {
		mes "�~�b�h�K���h�嗤��";
		mes "�ƂĂ������������B";
		mes "��������̒b�B��Y��Ȃ��悤�ɁB";
	}
	else {
		mes "���x�c�𓝊�����y�����Ɛ\���܂��B";
		mes "�����Ȃ����ł����A";
		mes "������肵�Ă����Ă��������B";
		mes "�l���̕��X�͑劽�}�ł���B";
	}
	close;
}
conch_in.gat,26,64,5	script	�K���x���[�D��#conch_in	10153,{
	mes "[�K���x���[�D��]";
	if(Job == Job_Summoner) {
		mes "���낻��o�q���B";
		mes "�����͂������H";
	}
	else {
		mes "�V�嗤�̖`���҂��B";
		mes "���͂��̑D�̑D���K���x���[���B";
	}
	close;
}
conch_in.gat,24,62,5	script	�X�e�����[#conch_in	10156,{
	mes "[�X�e�����[]";
	if(Job == Job_Summoner) {
		mes "�Ȃ񂾁H";
		mes "�q�C�m�̎d���ɋ���������̂��H";
	}
	else {
		mes "���̓X�e�����[�B";
		mes "���̑D�̍q�C�m������Ă���B";
	}
	close;
}
conch_in.gat,181,61,5	script	�b��#conch_in	421,{
	mes "[�b��]";
	if(Job == Job_Summoner) {
		mes "�����ςׂ݉͑S���Еt�������B";
		mes "�����Ȃ����܂��O�ɁA";
		mes "�������Əo�q�Ƃ�������I";
	}
	else {
		mes "�����̗������A��͂�������";
		mes "�����̘r�͊m���Ȃ񂾂��B";
	}
	close;
}
conch_in.gat,181,58,3	script	���ǎ�#conch_in	561,{
	mes "[���ǎ�]";
	if(Job == Job_Summoner) {
		mes "���悢��o�q���B";
		mes "�悤�₭���̘r�̌�������";
		mes "����Ă����ȁB";
	}
	else {
		mes "�G�b�O�����̂�낤�B";
		mes "�܁[���T�{���Ă₪��ȁB";
	}
	close;
}
conch_in.gat,186,57,3	script	������#conch_in	548,{
	mes "[������]";
	if(Job == Job_Summoner) {
		mes "���������������̂��H";
		mes "�тɂ͂܂��������B";
	}
	else {
		mes "�Ȃ񂾁H";
		mes "���͖Z���������ɂ��Ă���B";
	}
	close;
}
conch_in.gat,122,61,5	script	�D��#conch_in_01	559,{
	mes "[�D��]";
	mes "�V�嗤�ɂ͏��߂Ăł����H";
	mes "��x���s���Č������ƂȂ��ꏊ��";
	mes "�s���C���͂ǂ��ł����H";
	next;
	mes "[�D��]";
	mes "�ǂ��ǂ����܂��񂩁H";
	mes "�������߂Ă̎��͖���܂���ł����B";
	mes "���܂��ɐV�嗤�ɍs���Ƃ��ɂ�";
	mes "���������܂��B";
	close;
}
conch_in.gat,169,70,3	script	�D��#conch_in_02	545,{
	mes "[�D��]";
	mes "�X�e�����[�ꓙ�q�C�m�Ȃ�";
	mes "�n�}�ɂ��Ȃ��V�嗤�ւ̍q�H��";
	mes "�܂������o�������ȋC������B";
	next;
	mes "[�D��]";
	mes "�����̏u�Ԃ������̖ڂ�";
	mes "���邽�߂ɂ��A";
	mes "����ł�����";
	mes "���̑D�ɏ���Ă��Ȃ���B";
	close;
}
conch_in.gat,166,68,6	script	�D��#conch_in_03	544,{
	mes "[�D��]";
	mes "�~�b�h�K���h���������ꂽ���ǁA";
	mes "���ɂ����邩�ȁH";
	mes "�n�}�ɂ��Ȃ��ꏊ�B";
	mes "�܂����������s�������Ƃ��Ȃ��ꏊ�B";
	mes "����ȏꏊ���邩�ȁH";
	close;
}
lasagna.gat,226,181,3	script	�J�����[#lasagna	548,{
	mes "[�J�����[]";
	mes "�J���[�j���~���N��";
	mes "��ȍޗ���m���Ă��邩�H";
	mes "�J���[�j���Ƃ������ʂȊL��";
	mes "���y�����č�����G�b�Z���X��";
	mes "�V�N�ȋ����ō���Ă���B";
	next;
	mes "[�J�����[]";
	mes "�����K�؂ȗʂō�����B";
	mes "�����Ƀj�����_���̎����ꏏ��";
	mes "�Y����Ƃ݂�Ȃ�������";
	mes "�J���[�j���~���N�ɂȂ�񂾁B";
	close;
}
lasagna.gat,225,290,5	script	��Ɣǒ�#lasagna	421,{
	mes "[��Ɣǒ�]";
	mes "���̎d������������Ƃ���H";
	mes "�����Ɋo������ȒP�Ȏ����B";
	mes "�R���L���i���̃K���x���[�D����";
	mes "���ɏ�肩�����ȁB";
	close;
}
lasagna.gat,139,299,3	script	�C���V���D�D��#lasagna	561,{
	mes "[�C���V���D�D��]";
	mes "�C���V�Y�Ƃ�";
	mes "�ȑO��藎������ł��Ă�";
	mes "�l��͏�ɕs�����Ă���B";
	close;
}
lasagna.gat,263,156,5	script	���΂������#lasagna	554,{
	mes "[���΂������]";
	mes "�̂̃��U�[�j���͐��������B";
	mes "�����Z�����{���{���B";
	mes "�����͈Í����ƌĂ΂�Ă����B";
	next;
	mes "[���΂������]";
	mes "���鎞�A���̗V�тȂ̂�����Ȃ����A";
	mes "�������ǂ���";
	mes "���̃`���s���������X��������A��";
	mes "������莩����������������x�c��";
	mes "�L�̎�T�[�r�X�ɓ���n�߂��񂾁B";
	next;
	mes "[���΂������]";
	mes "�X���������Ȃ��z���";
	mes "�݂�ȃ��U�[�j��������A";
	mes "�V�����l�������ł݂���";
	mes "��������c�����B";
	mes "���̃��U�[�j����";
	mes "�S�����̎q������������񂾁B";
	close;
}
lasagna.gat,244,231,3	script	�C���V���D��#lasagna	544,{
	mes "[�C���V���D��]";
	mes "���̉��F���`�[�Y���ɉ�����";
	mes "�����čs���΁A";
	mes "�������̌̋��������B";
	mes "�����͖߂肽���B";
	close;
}
lasagna.gat,260,134,3	script	���X���X#lasagna	546,{
	mes "[���X���X]";
	mes "���̉��F���`�[�Y����";
	mes "���x�c�ƔL�̎�T�[�r�X��";
	mes "��������̂Ȃ񂾁B";
	mes "�p�[�X�^�嗤�̂ǂ�����ł�";
	mes "���̉��F�̃`�[�Y����H���Ă�����";
	mes "���U�[�j���֋A���ė����B";
	close;
}
lasagna.gat,141,166,5	script	�N����#lasagna	555,{
	mes "[�N����]";
	mes "��������Ă���ƌ�邱�Ƃ�����B";
	mes "���̐��E�̂ǂ�����ł�";
	mes "�~�[�g�\�[�X�̓�����";
	mes "����Ƃ������Ƃ��B";
	close;
}
lasagna.gat,233,174,5	script	��������#lasagna_01	561,{
	mes "[���ݎ�]";
	mes "�J���[�j���~���N��";
	mes "������荬���Ă�����܂Ȃ���B";
	mes "�ŋ߂����ɗ�������҂�����";
	mes "�U���Ĉ���ł���݂��������ǁA";
	mes "����͂��q����܂̂�邱�Ƃ��B";
	close;
}
lasagna.gat,236,173,3	script	��������#lasagna_02	561,{
	mes "[���ݎ�]";
	mes "�J���[�j���~���N��";
	mes "�悭�U���Ă�����ނ̂���Ԃ��B";
	mes "���y���ꂽ�J���[�j����";
	mes "�����ƍ����邱�Ƃō��o�����";
	mes "�@�ׂȖ��������邱�Ƃ��ł���B";
	close;
}
lasagna.gat,200,278,5	script	�S�z�����ȃh����#lasagn	559,{
	emotion 54, "�S�z�����ȃh����#lasagn";
	mes "[�S�z�����ȃh����]";
	mes "�ŋ߁A�s�@�ɃC���V���l�鋙�D��";
	mes "�x����ď悹����h������";
	mes "�����炵���B�|�����̒��ɂȂ����ˁB";
	mes "���x�c���{�C�ɂȂ���";
	mes "�T���܂���Ă���炵���ł���B";
	close;
}
lasagna.gat,202,276,5	script	�����ꂽ�h����#lasagna	560,{
	emotion 18, "�����ꂽ�h����#lasagna";
	mes "[�����ꂽ�h����]";
	mes "������I";
	mes "���؃N���[�Y���s�������������I";
	mes "�Ȃ�ĉ^���ǂ��񂾁I";
	mes "�����W���ꏊ��";
	mes "�C���V���D�O�ɍs���Ȃ���I";
	close;
}
lasagna.gat,209,301,3	script	���X�^�`#lasagna	10167,{
	mes "[���X�^�`]";
	mes "�V�嗤�ɗ����O��";
	mes "�g�����Ȃ݂𐮂��Ă݂ẮH";
	close;
}
lasagna.gat,236,179,5	script	�j�����N��#lasagna	10163,{
	mes "[�j�����N��]";
	mes "��������������Ȃ�";
	mes "���x�c�ɗ���ł݂���H";
	close;
}
lasagna.gat,229,197,5	script	�g�X#lasagna	10164,{
	emotion 22, "�g�X#lasagna";
	mes "[�g�X]";
	mes "��͂�L���ȏꏊ������l�������ȁB";
	close;
}
lasagna.gat,228,193,5	script	�|���g#lasagna	10163,{
	emotion 32, "�|���g#lasagna";
	mes "[�|���g]";
	mes "�����ɗ����Ȃ�";
	mes "�J���[�j���~���N��";
	mes "����ł����Ȃ��ƂȁI";
	close;
}
lasagna.gat,226,196,5	script	�A����#lasagna	10166,{
	emotion 7, "�A����#lasagna";
	mes "[�A����]";
	mes "����낫��낵�Ȃ��́I";
	mes "�c�ɎҊۏo������Ȃ��I";
	close;
}
lasagna.gat,227,187,1	script	���H���S��#lasagna	544,{
	mes "[���H���S��]";
	mes "����ɂ��́B";
	mes "�p�u�u�I�[�u���v�ւ悤�����B";
	mes "�����͌��܂�܂������H";
	next;
	mes "[���H���S��]";
	mes "�y�����c���A�K���x���[�D���A";
	mes "�g�[�}�X�D���ɂ��";
	mes "�u�I�[�u���̐����v�̉e���ŁA";
	mes "�݂�ȃJ���[�j���~���N��";
	mes "�������܂����A��Ԗ���";
	mes "���M�̂���̂̓{�X�̗����ł��B";
	next;
	mes "[���H���S��]";
	mes "���g���ɐS�����߂Ď���ꂵ����A";
	mes "��ł����ƃC����";
	mes "�����ĂԂ��Č`�����";
	mes "�g�������̂ł��B";
	mes "�{���ɔ��������̂�";
	mes "�N���������܂���B";
	next;
	mes "[���H���S��]";
	mes "������ŋ߂͍ޗ���";
	mes "�������Ă����Ȃ��̂ŁA";
	mes "�}�Ȓ���������ƁA";
	mes "��������܂ő�����";
	mes "�����ɍs����ł��B";
	next;
	emotion 54, "���H���S��#lasagna";
	mes "[���H���S��]";
	mes "���[���A�{���ɔ��������̂Ɂc�c�B";
	close;
}
lasagna.gat,232,187,6	script	�t�F�b�g�D�`�[�j��#lasa	545,{
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�����œ����Ă���Ȃ�Ɍo���ǁA";
	mes "�����ɉ����[�Ȃ̂ŎM�􂢂�";
	mes "���ׂĎ��̒S���ł��B";
	next;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�D�ɏ��ɍs���O�Ɉ�t�A";
	mes "�����q�C���I���Ĉ�t�A";
	mes "�e�n����K�˂ė����`���҂���t�A";
	mes "���������ł���l����t�A";
	mes "����ɂ��Ĉ��݂����l����t�c�c";
	next;
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "�Ƃɂ������Ȃ��Ƃ����Ȃ�";
	mes "�H��̐����z���𒴂��܂��B";
	mes "���ꂾ���ł͂���܂����A";
	mes "���x�c�ƔL�̎�E�������̋������A";
	mes "�V�Ė`���҂�������̑��k���X�c�c";
	next;
	emotion 28, "�t�F�b�g�D�`�[�j��#lasa";
	mes "[�t�F�b�g�D�`�[�j��]";
	mes "24���Ԃ��ᑫ��Ȃ��ł��B";
	mes "�]�ƈ��𑝂₹�΂����̂ɁI";
	close;
}
lasagna.gat,232,181,5	script	�����M���C�[�l#lasagna	559,{
	mes "[�����M���C�[�l]";
	mes "�����͎��x�c�{���ł����A";
	mes "�`���҂���������Ă���";
	mes "�p�u�ł�����܂��B";
	mes "�e�n���牟���񂹂ė����`���҂�";
	mes "�o���k�����킵����A";
	mes "�`���̒��Ԃ�T����������܂��B";
	next;
	mes "[�����M���C�[�l]";
	mes "�ŋ߂ł͐V�嗤�ɗ����O��";
	mes "�����d����ɗ���l�������܂����B";
	next;
	mes "[�����M���C�[�l]";
	mes "�\���N�O�ɂ͕s�ǃh����������";
	mes "�X�������Ď��x�c�ɓ��c�����邽�߂�";
	mes "�ꏊ�Ƃ��Ă��g���܂����B";
	mes "����ȑO�͍r����҂̑D��肽����";
	mes "����̔�������ꏊ��������ł��B";
	next;
	mes "[�����M���C�[�l]";
	mes "�y�����c���A�K���x���[�D���A";
	mes "�g�[�}�X�D���������ŏo��܂����B";
	mes "3�l�͂����ŋ`�Z����J�����сA";
	mes "���̌�̌��J�ł������U�[�j����";
	mes "������`���ɂȂ�܂����B";
	next;
	mes "[�����M���C�[�l]";
	mes "�ނ�ɓ���Ă���Ă���";
	mes "�`���҂�������ł���B";
	close;
}
lasagna.gat,190,239,5	script	�c���j�����R#lasagna_01	559,{
	unittalk "�c���j�����R : ���͂��̗V�я�̑������ɂ�`�B";
	end;
}
lasagna.gat,180,230,7	script	�c���j�����R#lasagna_02	560,{
	unittalk "�c���j�����R : �n�@�c�c����ȗc�t�Ȃ��Ƃ͈ꏏ�ɗV�ׂȂ��ɂ�`�B";
	end;
}
lasagna.gat,192,245,7	script	�c���j�����R#lasagna_03	554,{
	unittalk "�c���j�����R : �ю��̉򂪂ЂƂA�ȂȂA�ӂ��A�ނ��c�c�����ɂ�!!";
	end;
}
lasagna.gat,184,234,5	script	�c���j�����R#lasagna_04	422,{
	unittalk "�c���j�����R : ����ǂ����ē]����Ȃ��ɂ�`�H�]����悤�ɂ��Ăɂ�`�B";
	end;
}
lasagna.gat,186,231,3	script	�c���j�����R#lasagna_05	10167,{
	emotion 28, "�c���j�����R#lasagna_05";
	unittalk "�c���j�����R : �V�[�\�[�ɏ��Ȃ���ꏏ�ɗV�т�����͏W�܂�`�B";
	end;
}
lasagna.gat,211,186,5	script	��D�ē���#lasagna	559,{
	mes "[��D�ē���]";
	mes "����ɂ��́I";
	mes "�V�嗤�ɗ����D�͂�������k��";
	mes "�D������ɒ┑���Ă��܂���B";
	close;
}
lasagna.gat,222,187,3	script	�{�X#lasagna	548,{
	mes "[�{�X]";
	mes "�Ȃ񂾁H";
	mes "���񂽂��J���[�j���~���N�����H";
	close;
}
lasagna.gat,202,291,3	script	���x�c�ē���#lasagna01	10162,{
	mes "[���x�c�ē���]";
	mes "�`�����U�[�j���ւ悤�����I";
	mes "�������K�v�Ȏ���";
	mes "���ł��t�@���t�@�[�����x�c��";
	mes "�K�˂ĉ������B";
	close;
}
lasagna.gat,174,160,3	script	���x�c�ē���#lasagna02	10162,{
	mes "[���x�c�ē���]";
	mes "����ɂ��́B";
	mes "�ǂ��V�C�ł��ɂ�B";
	close;
}
lasagna.gat,233,197,5	script	���x�c���I���I#lasagna	10155,{
	mes "[���x�c���I���I]";
	mes "���̕��̓t�@���t�@�[�����x�c��";
	mes "�c���ł���y�����l���I";
	close;
}
lasagna.gat,77,263,5	script	�^�����[#lasagna	10166,{
	mes "[�^�����[]";
	mes "�����d�����d�グ�Ȃ��Ɓc�c";
	mes "�҂����킹�ɊԂɍ���Ȃ���B";
	close;
}
lasagna.gat,191,174,3	script	�S����#lasagna	547,{
	emotion 45, "�S����#lasagna";
	mes "[�S����]";
	mes "�ǂ��V�C���ɂႠ�B";
	close;
}
lasagna.gat,165,125,5	script	����l#lasagna	10163,{
	mes "[����l]";
	mes "�����̑��q�͂��������ǂ��܂�";
	mes "�z�B�ɍs�������Ă����񂾁H";
	close;
}
lasagna.gat,175,209,3	script	��������#lasagna	547,{
	mes "[��������]";
	mes "�݂�ȃo�[�ň���łĒN�����Ȃ��B";
	mes "�ɂ��c�c�B";
	close;
}
lasagna.gat,73,237,5	script	�������������h����#lasa	544,{
	mes "[�������������h����]";
	mes "���̕ӂ�͐Â��ł����c�c�B";
	mes "���S���͗��s�҂␌��������";
	mes "���邳���Ă��܂��B";
	close;
}
lasagna.gat,71,200,3	script	�����Ă���h����#lasagn	546,{
	mes "[�����Ă���h����]";
	mes "����H";
	mes "�����͋x�݂��B";
	mes "�ǂ����悤�c�c�B";
	close;
}
lasagna.gat,61,115,3	script	�����ȃh����#lasagna	560,{
	mes "[�����ȃh����]";
	mes "���͋C�ɂȂ镨��";
	mes "�Ђ��[���璲�ׂ鐫�i�Ȃ񂾁B";
	mes "���l�̉Ƃ̕�������";
	mes "�Ђ��[���璲�ׂ��Ⴄ���I";
	close;
}
lasagna.gat,88,91,3	script	���ɏo��h����#lasagna	555,{
	mes "[���ɏo��h����]";
	mes "�����V�嗤�ɍs���Ȃ��ƁI";
	mes "��؍���Ă�ꍇ����˂��I";
	close;
}
lasagna.gat,186,193,3	script	�O���痈���h����#lasagn	553,{
	mes "[�O���痈���h����]";
	mes "���������U�[�j�������I";
	mes "��[���A����Ă�邼�[�I";
	close;
}
lasagna.gat,103,119,5	script	�����h����#lasagna	545,{
	mes "[�����h����]";
	mes "���̐��̂��ׂĂ̐����̂�";
	mes "�����������Ă���B";
	mes "�e�X�̑����̑����𗝉������";
	mes "�킢��L���ɐi�߂��邾�낤�B";
	next;
	mes "[�����h����]";
	mes "�������H";
	mes "�ق��A�����������c�c�B";
	close;
}
lasagna.gat,140,269,3	script	�@�ׂȒ���#lasagna	10166,{
	mes "[�S�}�[]";
	mes "�˂��A���^�[�I";
	mes "�����ƕЂÂ��Ȃ����I";
	mes "�����Ɏ����̔j�Ђ������Ă���I";
	next;
	emotion 6, "�@�ׂȒ���#lasagna";
	mes "[�S�}�[]";
	mes "�W���M�[�A";
	mes "�^���f�B��������������Ȃ��I";
	mes "�����͂����Ƃ��Ă����Ȃ��́H";
	next;
	emotion 7, "�@�ׂȒ���#lasagna";
	mes "[�S�}�[]";
	mes "���������A�W���ł��Ȃ��I";
	mes "�킽���̖ʓ|�����Ă����";
	mes "����������Ƃ����Ԃɉ߂����Ⴄ��I";
	close;
}
lasagna.gat,131,269,5	script	�����Ȏ��j#lasagna	555,{
	mes "[���^�[]";
	mes "��������A���ꂳ��A";
	mes "�����ɖ߂��ė��ĉ������B";
	next;
	mes "�]�ꂫ�Ȃ��牽��������Ă���]";
	close;
}
lasagna.gat,131,274,5	script	�E���ȎO�j#lasagna	10164,{
	mes "[�W���M�[]";
	mes "�E�B�B�B�B���I";
	mes "�C�k�n�b�J�����̃W���M�[�����I";
	mes "������̂Ăē��~����I";
	close;
}
lasagna.gat,140,274,3	script	��C�Ȏl�j#lasagna	546,{
	mes "[�^���f�B]";
	mes "���o�����͂悭�{�邯�ǁA";
	mes "�����Y��ɂ�����悤��";
	mes "�V�����m��������Ă�����ł��B";
	mes "���o�����͑�D���ł��B";
	next;
	mes "[�^���f�B]";
	mes "�Z����񂽂��͕|���ł��B";
	mes "�^���f�B����ꂽ����";
	mes "�����ƕ����悤�ɓw�͂��Ă܂��B";
	next;
	emotion 28, "��C�Ȏl�j#lasagna";
	mes "[�^���f�B]";
	mes "����ł����^�[�Z������";
	mes "�Ί�������Ȃ����A";
	mes "�W���M�[�Z�����͋C��������Ȃ���";
	mes "�悭�~�~�Y�������ė����ł��B";
	mes "���������ł��c�c�B";
	close;
}
lasagna.gat,339,248,3	shop	����i���l#lasagna	10163,744,745,2338,2206,7170,2613

lasagna.gat,347,261,4	script	���x�c���I���I#do_su99	10155,{}
lasagna.gat,342,261,4	script	�W���h�E#do_su99	10159,{}
lasagna.gat,337,261,3	script	�p�t�[��#do_su99	735,{}
lasagna.gat,352,261,4	script	�V�o#do_su99	10160,{}

lasagna.gat,205,327,0	warp	warp03#lasagna	2,2,conch_in.gat,55,61
conch_in.gat,59,62,0	warp	warp01#conch_in	2,2,lasagna.gat,205,324
conch_in.gat,50,60,0	warp	warp02#conch_in	2,2,conch_in.gat,30,60
conch_in.gat,36,60,0	warp	warp03#conch_in	2,2,conch_in.gat,54,60
conch_in.gat,143,60,0	warp	warp04#conch_in	2,2,conch_in.gat,165,60
conch_in.gat,159,60,0	warp	warp05#conch_in	2,2,conch_in.gat,138,60
lasagna.gat,203,324,5	script	�G�b�O����#do_tu02	10157,{
	mes "[�G�b�O����]";
	if(Job == Job_Summoner) {
		mes "���������由�Ƃ���";
		mes "��ʂ̎G�p�������t����ꂽ�񂾁B";
		mes "�T�{��Ȃ������Ă��Ȃ���ˁB";
	}
	else {
		mes "���[";
		mes "�ǂ��V�C���ȁ[�B";
		mes "��D�̃T�{����a���˂��B";
	}
	next;
	mes "[�G�b�O����]";
	mes "��H";
	mes "�ǂ����ɍs�������́H";
	next;
	switch(select("�C�Y���[�h -> 0 z","�}������ -> 0 z","�s���Ȃ�")) {
	case 1:
		warp "izlude.gat",194,180;
		end;
	case 2:
		warp "malangdo.gat",217,85;
		end;
	case 3:
		mes "[�G�b�O����]";
		mes "���[�����Ȃ��B";
		close;
	}
}

lasagna.gat,335,248,3	script	�����R���p�j�I��#wedd	10162,{
	mes "[�A���R�o���[�m]";
	mes "����ɂ��́I";
	mes "�����͖{���ɗǂ��V�C�ł���ˁH";
	mes "�V���Ȗ�o�Ƀs�b�^���ł��B";
	next;
	mes "[�A���R�o���[�m]";
	mes "�{���͂ǂ�����܂������H";
	next;
	switch(select("�������ɂ��ĕ�������","�������̎菇��m�肽��","��������\�����݂���","�\����e��ύX������","���ł�����܂���")) {
	case 1:
		mes "[�A���R�o���[�m]";
		mes "�F�l�́A";
		mes "�����͈��̏W�听�ƌ����܂����A";
		mes "���̍l���͏����Ⴂ�܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�����Ƃ̓S�[���ł͂Ȃ��A";
		mes "�V���ȃX�^�[�g�ł��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "���ꂩ��̈ꐶ���A";
		mes "�����ƕ��������킹�Ȃ���A";
		mes "�V�������E��";
		mes "���ɕ���ł������Ƃł͂���܂��񂩁H";
		next;
		mes "[�A���R�o���[�m]";
		mes "���ꂩ��̈ꐶ�����ɑ��肽����";
		mes "�v�����点�锺���Ƃ����̂́A";
		mes "�ǂ�قǑf���炵�����݂Ȃ�ł��傤�B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�ꐶ�Ɉ�x���邩�Ȃ����̑�؂��J���A";
		mes "���ʂ�푰�A���ЁA�@���Ȃǂ�";
		mes "�����킯�ɂ͂����܂����ˁB";
		next;
		mes "[�A���R�o���[�m]";
		mes "�ꐶ�����ɕ��݂������������炵����A";
		mes "�������U�[�j����";
		mes "�������������Ă��������B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�v�w�ɂȂ��";
		mes "^0000cd���Ɏg�p�ł���X�L��^000000�������A";
		mes "������^0000cd�{�q���}����^000000���Ƃ�";
		mes "�\�ł�����ˁB";
		next;
		mes "[�A���R�o���[�m]";
		mes "�v�w�ɂȂ�ɂ͂��{�l�l�Ɣ����̕���";
		mes "���ꂼ��BaseLv45�ȏ�ł���K�v������܂��B";
		mes "�������A�َ푰�Ԃł̂������̏ꍇ��";
		mes "���[���������K�v�Ȃ̂ŁA";
		mes "BaseLv100�ȏ�łȂ���΂Ȃ�܂���B";
		next;
		mes "[�A���R�o���[�m]";
		mes "������Ɗ肦�Ή����ł���܂����A";
		mes "��Ȃ����ɂ͏����邱�Ƃ��ł��܂��B";
		mes "�{���Ƀ��}���`�b�N�ł͂���܂��񂩁H";
		close;
	case 2:
		mes "[�A���R�o���[�m]";
		mes "�������̎菇�͂ƂĂ��ȒP�ł��B";
		mes "�玮�ɕK�v�ȕ����������Ē������";
		mes "�����Ɏ����������܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "��ځA";
		mes "^0000cd�j���̕��̓^�L�V�[�h�A";
		mes "�����̕��̓E�F�f�B���O�h���X^000000";
		mes "�����������������B";
		next;
		mes "[�A���R�o���[�m]";
		mes "���͐l�����Ƃ����܂��B";
		mes "�C�����̐؂�ւ��ɂ��Ȃ�܂����ˁB";
		next;
		mes "[�A���R�o���[�m]";
		mes "��ځA";
		mes "���������������́A�i���̈��̐����Ƃ���";
		mes "^0000cd�_�C���̎w�ւ��e1����^000000";
		mes "�������Ă��������B";
		mes "�������̏I���Ɏw�ɂ͂߂܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�O�ځA";
		mes "�Ō�Ɍ�����������s����p�Ƃ���";
		mes "^0000cd1,200,000zeny^000000���K�v�ł��B";
		mes "^0000cd�V�Y�V�w���ꂼ�ꂲ�p�ӂ�������^000000";
		next;
		mes "[�A���R�o���[�m]";
		mes "�����S�Ă���������A";
		mes "��������\�肳��Ă����l���玄��";
		mes "�������̐\���݂����肢���܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�����āA";
		mes "^0000cd���̓�l���p�[�e�B�[^000000��g�݁A";
		mes "�i���̒S���ł��鎩�x�c���̂��Ƃ�";
		mes "��������s���Ă��������B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�������炪�d�v�ł����A";
		mes "�i���҂Ɍ��������҂�^0000cd���O��";
		mes "���m��^000000�����Ȃ��Ă͂Ȃ�܂���B";
		mes "�Ԉ�������O�������ƁA";
		mes "����ȏ�A��������i�߂��܂���B";
		next;
		mes "[�A���R�o���[�m]";
		mes "���̌�A";
		mes "^0000cd�����ɂȂ���������ɓ���^000000���ꂽ��A";
		mes "�����������͏I������܂��B";
		mes "��l�͕v�w�Ƃ���";
		mes "���ɂ�����悤�ɂȂ�܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�Ȃ��A�������͈�x�Ɉ�g����";
		mes "�i�s���܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "������\�����񂾕���";
		mes "��������������ꍇ�́A";
		mes "�b�����҂������Ă���";
		mes "���������Ă��������B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�Ⴄ���ƌ������Ă��܂��S����";
		mes "�]�܂Ȃ�����́c�c�B";
		next;
		mes "[�A���R�o���[�m]";
		mes "���������n�܂�܂�����";
		mes "^0000cd3���ȓ���";
		mes "�����̓���^000000�𓾂Ă��������B";
		next;
		mes "[�A���R�o���[�m]";
		mes "3�����Z�����Ԃ̂悤��";
		mes "�v����������܂��񂪁A";
		mes "������܂ł��炵���킯�ł����A";
		mes "���ɐS�͌��܂��Ă���ł��傤�B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�����ɔ����̓��ӂ𓾂��Ȃ�";
		mes "�J�b�v���͌������Ƃ�����܂���̂ŁA";
		mes "�F�l�A�S�͐^�������Ȃ悤�ł��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "���������I�������A";
		mes "^0000cd�k�̑D����^000000����";
		mes "^0000cd�V�����s�Ƀs�b�^����";
		mes "�W�����C^000000�ɍs���D�ɏ��܂��B";
		mes "�D���͕K�v�Ȃ̂ŁA���Y�ꂸ�ɁB";
		next;
		mes "[�A���R�o���[�m]";
		mes "�������̎菇�ɂ��Ă͈ȏ�ł��B";
		mes "����ł́A";
		mes "���\�����݂����҂����Ă���܂��B";
		close;
	case 3:
		mes "[�A���R�o���[�m]";
		mes "�������̗\��ɂ��炵����ł��ˁI";
		mes "��������낵�����";
		mes "�\��̎葱�����n�߂܂��傤�B";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�A���R�o���[�m]";
			mes "�؂܂�܂����B";
			mes "�������l���Ă��������܂��B";
			close;
		}
		mes "[�A���R�o���[�m]";
		mes "����ł́A�\��̑O�ɒ��ӎ�����";
		mes "�������������܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "^0000cd������Ō����̐\������^000000�����ꂽ���";
		mes "��ނ𓾂Ȃ����R��";
		mes "�������������������Ȃ��ꍇ�ł��A";
		mes "������s���̗ǂ����Ԃ�";
		mes "���������������܂��B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�������A";
		mes "������Ō������̐\���݂������ƁA";
		mes "^0000cd�v�����e���̑吹���ł�";
		mes "���������������܂���B";
		mes "^000000����͑̌n�������قȂ邽�߂ł��B";
		mes "���������������B";
		next;
		mes "[�A���R�o���[�m]";
		mes "�ł́A����i�Ȃǂ��S�Ă���������";
		mes "�m�F�������܂��ˁB";
		mes "���΂炭���҂����������c�c�B";
		next;
		mes "[�A���R�o���[�m]";
		mes "����c�c�H�@����i�����Y��̂悤�ł��ˁB";
		next;
		mes "[�A���R�o���[�m]";
		mes "^0000cd1,200,000zeny�A^000000";
		mes "^0000cd�E�F�f�B���O�h���X 1���A^000000";
		mes "^0000cd�_�C���̎w�� 1��^000000";
		mes "�c�c���̒��ɁA�Y�ꕨ�͂Ȃ���";
		mes "�m�F���Ă��������܂��񂩁H";
		close;
	case 4:
		mes "[�A���R�o���[�m]";
		mes "�\����e�̕ύX�ł����H";
		next;
		mes "[�A���R�o���[�m]";
		mes "�����̎푰��";
		mes "�ԈႦ�Đ\�����Ă��܂��܂������H";
		mes "������Ɗm�F���܂��ˁB";
		next;
		mes "[�A���R�o���[�m]";
		mes "���݁A";
		mes "�������̗\�񂪂���Ă��܂���ˁB";
		mes "��ɗ\������Ă��������B";
		close;
	case 5:
		mes "[�A���R�o���[�m]";
		mes "���b���肪�K�v�ł�����A";
		mes "�܂����炵�Ă��������I";
		close;
	}
}
lasagna.gat,332,277,3	script	�i����#wedd02	10152,{
	mes "[�y�y�����`�[�m]";
	mes "���������";
	mes "^0000cd�����Ɠ�l�����̃p�[�e�B�[^000000��";
	mes "�g��ł���A�܂����炵�Ă��������ˁB";
	mes "�������Ƃ͓�l������";
	mes "�_���ȋV���ł�����B";
	close;
}
lasagna.gat,334,277,3	script	�����O�{�[�C#wedd01	546,{}
lasagna.gat,329,250,5	script	�t�����[�K�[��#wedd02	546,{}
lasagna.gat,334,250,3	script	�q��#wedd03	546,{}
lasagna.gat,331,270,0	script	#wedd01	139,{}
lasagna.gat,331,262,0	script	#wedd02	139,{}
lasagna.gat,331,254,0	script	#wedd03	139,{}
lasagna.gat,329,272,5	script	�q��#wedd04	546,{}
lasagna.gat,334,272,3	script	�q��#wedd05	546,{}
lasagna.gat,329,267,5	script	�q��#wedd06	546,{}
lasagna.gat,334,267,3	script	�q��#wedd07	546,{}
lasagna.gat,329,262,5	script	�q��#wedd08	546,{}
lasagna.gat,334,262,3	script	�q��#wedd09	546,{}
lasagna.gat,200,300,3	script	��������̈ē�#wedd01	10162,{}
lasagna.gat,163,84,3	script	��������̈ē�#wedd02	10162,{
	mes "[��������̈ē�]";
	mes "����ɂ��́I�@�����V�C�ł���ˁH";
	mes "�C�����̂����������ł��B";
	mes "����ȓ��Ɍ�������������J�b�v���́A";
	mes "�ꐶ�K���ɂȂ�C�����܂��B";
	next;
	mes "[��������̈ē�]";
	mes "^0000cd������^0000cd��";
	mes "�o�Ȃ��ɂ�������Ⴂ�܂������H";
	mes "����Ƃ�";
	mes "����̉����ɂ�������Ⴂ�܂������H";
	next;
	if(select("�������ł����H","��������̈ē������肢���܂�") == 1) {
		mes "[��������̈ē�]";
		mes "�͂��I";
		mes "������l�ƈ�b�ł������ꏏ�ɋ�������";
		mes "�v�������Ƃ̂���l�Ȃ�A";
		mes "��������ł���ˁH";
		next;
		mes "[��������̈ē�]";
		mes "���̐l�ƂȂ�ꐶ�����ɂ�����";
		mes "�Ƃ����C�������I";
		next;
		mes "[��������̈ē�]";
		mes "��������΁A�������΂ɂ����邩��";
		mes "�ǂ��ł���ˁI";
		mes "����ȊO�ɂ����ʂȃX�L�����g�p���A";
		mes "���������Ȃ������ɁA";
		mes "�����̑O�ɏ������邱�Ƃ��o���܂���B";
		next;
		mes "[��������̈ē�]";
		mes "��������Ȃ����A";
		mes "���������X�L�����g�p�ł��܂��B";
		next;
		mes "[��������̈ē�]";
		mes "���̑��ɂ��ǂ��Ƃ���͂���܂����A";
		mes "�V���̓�l�������s���郊�]�[�g�n��";
		mes "�W�����C�œ�l����̎��Ԃ��߂�����̂�";
		mes "�ō��ł��B";
		next;
		mes "[��������̈ē�]";
		mes "�܂��A�����q�����l������";
		mes "�{�q�Ƃ��Č}���A�K���ȉƒ��";
		mes "�z�����Ƃ��ł��܂��B";
		next;
		mes "[��������̈ē�]";
		mes "�����A���U�[�j���ɂ͊e�n����";
		mes "���l�Ȑl���������𐾂��������߂�";
		mes "�K��܂��B";
		next;
		mes "[��������̈ē�]";
		mes "��������������ŁA";
		mes "������l�Ƃ̌�������������̂�";
		mes "�������ł��傤���H";
		close;
	}
	mes "[��������̈ē�]";
	mes "��������֍s����܂����H";
	next;
	mes "[��������̈ē�]";
	mes "���������";
	mes "^0000cd���U�[�j���̖k���ɂ��鋴��n��^0000cd��";
	mes "�����ł�����A�T���₷���ł��B";
	next;
	mes "[��������̈ē�]";
	mes "���̐Ԃ��ю���ǂ��čs���ƁA";
	mes "���ɖ������Ƃ͂���܂���B";
	next;
	mes "[��������̈ē�]";
	mes "�ł͍K���ɁI";
	close2;
	warp "lasagna.gat",335,246;
	end;
}
lasagna.gat,344,275,3	script	�t���[����#wedd	10163,{
	mes "[�t���[����]";
	mes "���Ԃ̍��肪�����ł��傤�H";
	mes "�V������o���}����";
	mes "�K���ȐV������̂��߂ɁA";
	mes "���ʏ����������ԂȂ�ł��B";
	next;
	mes "[�t���[����]";
	mes "�����ȕ��ł��A���肪�Y���܂��B";
	mes "��l�̏����ɍD�����肪";
	mes "�����ς��L�����ė~�����Ƃ́A";
	mes "���̊肢�����߂����Ԃł��B";
	close;
}
lasagna.gat,320,268,7	script	�V�g#wedd	10166,{
	mes "[�V�g]";
	mes "�V������o���}�����l�́A";
	mes "�����Ă��������ł��ˁB";
	next;
	mes "[�V�g]";
	mes "���������������d���͓���ł��B";
	mes "����ł��A����l��";
	mes "�K�����ɐZ���Ă��ꂽ��������ł��B";
	close;
}
lasagna.gat,319,290,1	script	����#wedd01	882,{
	mes "[����]";
	mes "�����l���ň�Ԃ̏o������";
	mes "�����ƕ����ꂽ��A";
	mes "�A�i�^�ƌ����������Ƃ��Ɠ������B";
	next;
	mes "[�j��]";
	mes "���͓�Ԗڂ̏o�������A";
	mes "�L�~�ƌ����������Ƃ����ǁB";
	next;
	mes "[����]";
	mes "�����H�@���Ⴀ�A��Ԗڂ́H";
	next;
	mes "[�j��]";
	mes "�L�~�ɏ��߂ďo���������A";
	mes "���̏�ŋ����������Ƃ��ˁB";
	mes "���̐l���ł��̎��قǁA";
	mes "�m�M�ɖ����������Ȃ�������B";
	emotion 31, "�j��#wedd01";
	misceffect 343, "�j��#wedd01";
	next;
	mes "[����]";
	mes "�Ȃ玄����Ԗڂ́A";
	mes "���̏�ŏ����������Ƃɂ���B";
	emotion 30, "����#wedd01";
	next;
	mes "[�j��]";
	mes "�������A�{���ɂ�����������ˁB";
	mes "�i���Ɉꏏ����B";
	close;
}
lasagna.gat,320,291,3	script	�j��#wedd01	881,{
	mes "[����]";
	mes "�����̌�������A��������������ˁH";
	next;
	mes "[�j��]";
	mes "�������ȁB";
	mes "�������̎��͂���ȏꏊ�Ȃ������̂ɁB";
	mes "�Y�킾�ˁc�c�B";
	next;
	mes "[����]";
	mes "�ł��A�吹���ł������������̌�������";
	mes "�ǂ�������ˁB";
	mes "�{���A���܂ł��Y����Ȃ���B";
	emotion 30, "����#wedd01";
	misceffect 343, "����#wedd01";
	next;
	mes "[�j��]";
	mes "��������B";
	emotion 31, "�j��#wedd01";
	next;
	mes "[����]";
	mes "��������25���N�́A";
	mes "�����ł܂��������������悤���H";
	next;
	mes "[�j��]";
	mes "����A������!!";
	next;
	mes "[����]";
	mes "25���N�͂܂��������ǁA";
	mes "�W�����C�֍s�����̓��̑z���o��";
	mes "�U��Ԃ�̂͂����o�����ˁI";
	next;
	mes "[�j��]";
	mes "�������ˁI�@���̎��̑z���o���I";
	next;
	mes "[����]";
	mes "�������s�����I�@�͂₭�I";
	close;
}
lasagna.gat,316,206,5	script	����#wedd02	958,{
	mes "[����]";
	mes "�_�[�����͂ǂ�����";
	mes "���Ă����Ă��܂��������Ȃ�́H";
	emotion 3, "����#wedd02";
	next;
	mes "[���Ȃ��Ɉ�������]";
	misceffect 343, "����#wedd02";
	next;
	mes "[�j��]";
	mes "�����n�j�[�������Ƃ����ƌ��Ă������B";
	emotion 3, "�j��#wedd02";
	next;
	mes "[�j��]";
	mes "�Ƃ���ŁA";
	mes "�����܂ŗ���̂ɔ�ꂽ�肵�ĂȂ��H";
	next;
	mes "[�N�����͌���]";
	misceffect 313, "����#wedd02";
	next;
	mes "[����]";
	mes "�_�[���������Ă���āA�{���ɏ������B";
	emotion 30, "����#wedd02";
	next;
	mes "[�j��]";
	mes "�����n�j�[�̉񕜍܂�����ˁB";
	emotion 31, "�j��#wedd02";
	close;
}
lasagna.gat,317,205,1	script	�j��#wedd02	962,{
	mes "[�j��]";
	mes "��������������炵���B";
	mes "���āI�@�{�����Y�킾�B";
	emotion 3, "�j��#wedd02";
	next;
	mes "[����]";
	mes "���������A";
	mes "�����Ŏ��������܂��傤�I";
	emotion 3, "����#wedd02";
	next;
	mes "[�j��]";
	mes "���̌��t�c�c�v���|�[�Y�H";
	next;
	mes "[����]";
	mes "�����A�v���|�[�Y�Ȃ�ł��I";
	mes "���̃_�[�����B";
	emotion 30, "����#wedd02";
	misceffect 343, "����#wedd02";
	next;
	mes "[�j��]";
	mes "���A���c�c���A���A���������������āA";
	mes "���Ɓc�c���t����肭�o�Ȃ��c�c�B";
	emotion 28, "�j��#wedd02";
	next;
	mes "[����]";
	mes "�����̂͂�������ǁA";
	mes "�Ԏ��͂��Ȃ�����ˁB";
	next;
	mes "[�j��]";
	mes "�͂��A����܂����B";
	mes "���Ȃ��Ɖi���𐾂��܂��B";
	emotion 31, "�j��#wedd02";
	misceffect 343, "�j��#wedd02";
	close;
}
lasagna.gat,346,237,5	script	������#wedd01	10164,{
	mes "[������]";
	mes "�W���W���[��!!";
	mes "�������l�̏Z��ł������U�[�j������I";
	mes "�ǂ��H";
	next;
	mes "[������]";
	mes "����H�@�ꂳ��H�@�V��H";
	mes "�݂�Ȃǂ��H";
	mes "�܂��������Ȃ������̂��ȁH";
	emotion 1, "������#wedd01";
	next;
	mes "[������]";
	mes "�ꂳ��`�A�͂₭���āI";
	next;
	mes "[���Ȃ��Ɉ�������]";
	next;
	mes "[������]";
	mes "�ꂳ��`�A�͂₭���āI";
	misceffect 36, "�ꂳ��#wedd01";
	cloakoffnpc "�ꂳ��#wedd01";
	next;
	mes "[�ꂳ��]";
	mes "�����A�����͂ǂ��H";
	next;
	mes "[������]";
	mes "���Ȃ�����A�l���Ă񂾂�B";
	mes "�V����Ă΂Ȃ���B";
	next;
	mes "[�V��A��������Ⴂ]";
	next;
	mes "[������]";
	mes "�V��`";
	misceffect 36, "�q�ǂ�#wedd01";
	cloakoffnpc "�q�ǂ�#wedd01";
	next;
	mes "[�ꂳ��]";
	mes "�傫�ȋ�����̂���̂�";
	mes "���Ă�Œ��������̂ɁB";
	next;
	mes "[�q�ǂ�]";
	mes "���������I�@�ʔ��������̂ɁI";
	next;
	mes "[������]";
	mes "�����H�@���߂�B";
	mes "����ɕ����񂪂����Ɩʔ������̂�";
	mes "�����Ă������B";
	next;
	mes "[�q�ǂ�]";
	mes "����I";
	mes "�ł����������Ă��̂����Ă���I";
	cloakonnpc "�q�ǂ�#wedd01";
	next;
	mes "[�ꂳ��]";
	mes "�������Ă��痈��ˁB";
	cloakonnpc "�ꂳ��#wedd01";
	next;
	mes "[������]";
	mes "�ꂳ��A�V��c�c�B";
	mes "�l���A�l���A��Ă��āc�c�B";
	emotion 28, "������#wedd01";
	close;
}
lasagna.gat,347,235,7	script	�ꂳ��#wedd01	10148,{
	end;
OnInit:
	cloakonnpc;
	end;
}
lasagna.gat,349,237,1	script	�q�ǂ�#wedd01	10167,{
	end;
OnInit:
	cloakonnpc;
	end;
}
lasagna.gat,302,323,3	script	�W�����C�u#wedd	10159,{
	mes "[�W�����C�u]";
	mes "�V��������A�������ꂽ2�l���A";
	mes "���ł��s���錶�̃��]�[�g�n�B";
	mes "�u�W�����C�v�ɂ݂Ȃ��܂�";
	mes "���҂������܂��I";
	next;
	if(select("�W�����C�H","�W�����C�֏o���`") == 1) {
		mes "[�W�����C�u]";
		mes "�~�b�h�K���h�嗤���牓�����ꂽ";
		mes "�Ƃ���ꏊ�ɁA�ЂƂ̓�������܂��B";
		mes "���}���`�b�N�ŊÂ����Ԃ�";
		mes "�߂�����ꏊ�Ȃ�ł��B";
		next;
		mes "[�W�����C�u]";
		mes "�����̓n�l���[���ŗL���ȏꏊ�ŁA";
		mes "�������ꂽ���̂ݍs���܂��B";
		next;
		mes "[�W�����C�u]";
		mes "���̓��ʂȏꏊ�ւ̑D����";
		mes "^0000cd100,000z^000000�ɂȂ�܂��B";
		next;
		mes "[�W�����C�u]";
		mes "���ʂȐl�����炵����A";
		mes "���ɊÂ����Ԃ��߂����Ă݂�̂�";
		mes "�������ł����H";
		close;
	}
	mes "[�W�����C�u]";
	mes "�ǂ�����܂������H";
	mes "���̑D�́A�n�l���[���ŗL����";
	mes "�W�����C�֍s���D�ł��B";
	next;
	mes "[�W�����C�u]";
	mes "��ώc�O�Ȃ���A";
	mes "�W�����C�֍s����̂�";
	mes "�����҂݂̂ɂȂ�܂��B";
	next;
	mes "[�W�����C�u]";
	mes "����ɐS���`���̗���";
	mes "�o������͔̂@���ł����H";
	close;
}

lasa_fild01.gat,35,288,3	script	���x�c���A�W�F�j���[#la	10162,{
	mes "[���x�c���A�W�F�j���[]";
	if(Job == Job_Summoner) {
		mes "���A�����ɓ��c�o�������B";
		mes "���ꂩ���낵���ȁI";
	}
	else {
		mes "�V�嗤�����ȗ��A";
		mes "���U�[�j���̒��͂��Ղ葛�����B";
	}
	close;
}
lasa_fild01.gat,60,322,3	script	���x�c���A���I#lasa_fil	10154,{
	mes "[���x�c���A���I]";
	if(Job == Job_Summoner) {
		mes "�~�b�h�K���h�ɂ͍s�������H";
		mes "���v�A�N�Ȃ牽�����Ă�";
		mes "���z���Ă����邳�B";
	}
	else {
		mes "���̓A���I�B�����Ŏ��x�c�ւ�";
		mes "���c��]�҂̃��N�`���[�����Ă���B";
	}
	close;
}

lasa_fild01.gat,134,381,0	warp	warp01#lasa_fild01	2,2,lasagna.gat,153,58
lasagna.gat,150,54,0		warp	warp01#lasagna	2,2,lasa_fild01.gat,131,378

lasa_fild01.gat,341,375,0	warp	lasagna_in02	2,2,lasagna.gat,327,56
lasagna.gat,327,51,0		warp	lasagna_out02	2,2,lasa_fild01.gat,344,371

lasagna.gat,358,91,0		warp	warp02#lasagna	2,2,lasa_fild02.gat,20,98
lasa_fild02.gat,16,98,0		warp	warp01#lasa_fild02	2,2,lasagna.gat,355,92

lasa_fild02.gat,348,244,0	warp	warp02#lasa_fild02	2,2,lasa_dun01.gat,24,143
lasa_dun01.gat,18,143,0		warp	warp01#lasa_dun01	2,2,lasa_fild02.gat,344,243

lasa_dun01.gat,157,98,0	warp	warp02#lasa_dun01	2,2,lasa_dun02.gat,22,171
lasa_dun02.gat,18,171,0	warp	warp01#lasa_dun02	2,2,lasa_dun01.gat,153,98

lasa_dun02.gat,146,58,0	warp	warp02#lasa_dun02	2,2,lasa_dun03.gat,190,18
lasa_dun03.gat,190,15,0	warp	warp01#lasa_dun03	2,2,lasa_dun02.gat,146,54

lasa_dun01.gat,29,146,5	script	���x�c��#lasa_dun01	10162,{
	mes "[���x�c��]";
	if(Job == Job_Summoner) {
		mes "����A�`���҂���B";
		mes "�^���g�D�[�t�B��";
		mes "��ɗ�����ł����H";
	}
	else {
		mes "����A�V�嗤�̖`���҂���";
		mes "����ȂƂ���ɉ��̗p�ł����H";
	}
	close;
}

lasa_dun03.gat,247,194,0	script	object02#lasa_dun03	139,{}

lasa_dun03.gat,162,158,3	script	�^���g�D�[�t�B#lasa_dun	10161,{
	mes "[�^���g�D�[�t�B]";
	if(Job == Job_Summoner) {
		mes "�₠�A���̑O�͐��b�ɂȂ����ˁB";
		mes "�����~�b�h�K���h�ɂ�";
		mes "�s�����̂����H";
		next;
		mes "[�^���g�D�[�t�B]";
		mes "�������̓o�W�����X�N�̂�炪";
		mes "�܂������o�����݂����Ȃ񂾁B";
		mes "�܂����������Ƃ������A������B";
	}
	else {
		mes "�N�̓~�b�h�K���h�嗤�̖`���ҁH";
		mes "�ǂ�������ʔ����b�ł�";
		mes "�������Ă�B";
	}
	close;
}
