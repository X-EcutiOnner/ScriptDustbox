1@lab.gat,102,28,0	warp	lab_warp#1	1,1,1@lab.gat,97,28	//61639
1@lab.gat,80,28,0	warp	lab_warp#2	1,1,1@lab.gat,75,28	//61640
1@lab.gat,58,28,0	warp	lab_warp#3	1,1,1@lab.gat,53,28	//61641
1@lab.gat,104,34,4	script	���C������#pa0829	865,{/* 61642 */
	if('flag) {
		mes "[���C������]";
		mes "���ɓ�����͊J���Ă��܂���B";
		close;
	}
	mes "[���C������]";
	mes "�����i���o�[32001��";
	mes "�����⏕�҂Ƃ���";
	mes "�Q��������ł����H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[���C������]";
		mes "���������ԈႦ���悤�ł��ˁB";
		mes "�C���t�H���[�V������";
		mes "�ēx�₢���킹���������B";
		close;
	}
	mes "[���C������]";
	mes "�������苖�R�[�h�̊m�F�����܂��B";
	mes "���X���҂����������B";
	initnpctimer;
	set 'flag,1;
	close;
OnTimer4000:
	npctalk "���C������ : ���R�[�h�̈�v���m�F�B�������J���܂��B";
	end;
OnTimer8000:
	npctalk "���C������ : �ǂ����A�����肭�������B�����炱����ւ̈ړ��͂ł��܂���̂Œ��ӂ��Ă��������B";
	hideoffnpc "lab_warp#1"; //61639
	end;
}
1@lab.gat,104,34,4	script	���C������#pa0829_2	865,{/* 61643 (hide)*/}

1@lab.gat,37,37,3	script	�X�C�b�`128#	844,{/* 61652 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,39,37,3	script	�X�C�b�`64#	844,{/* 61653 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,41,37,3	script	�X�C�b�`32#	844,{/* 61654 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,43,37,3	script	�X�C�b�`16#	844,{/* 61655 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,46,37,3	script	�X�C�b�`8#	844,{/* 61656 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,48,37,3	script	�X�C�b�`4#	844,{/* 61657 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,50,37,3	script	�X�C�b�`2#	844,{/* 61658 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,52,37,3	script	�X�C�b�`1#	844,{/* 61659 */
	set '@name$,strnpcinfo(0);
	mes "[" +'@name$+ "]";
	mes "���݂��̃X�C�b�`�̏�Ԃ�" +('flag? "ON": "OFF")+ "�ł��B";
	next;
	switch(select("ON","OFF")) {
	case 1:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��ON�ɂ��܂����B";
		set 'flag,1;
		close;
	case 2:
		misceffect 18; //61659
		mes "[" +'@name$+ "]";
		mes "�X�C�b�`��OFF�ɂ��܂����B";
		set 'flag,0;
		close;
	}
}
1@lab.gat,45,32,3	script	��C������#pa0829	865,{/* 61660 */
	mes "[��C������]";
	mes "�����܂ł����łɂȂ����Ƃ������Ƃ�";
	mes "^ff0000���q��������^000000�̎Q���҂ł��ˁB";
	next;
	mes "[��C������]";
	mes "�{���̗������苖�R�[�h��";
	mes "^0000ff155^000000�ł��B";
	mes "���R�[�h��2�i���ɕϊ����āA";
	mes "���̌��ɂ���X�C�b�`��";
	mes "���͂��Ă��������B";
	next;
	mes "[��C������]";
	mes "���̃R�[�h�͓��ւ��ł��B";
	mes "���͒��ɓ��t���ς��ƁA";
	mes "�R�[�h���ύX����܂��̂�";
	mes "�����ӂ��������B";
	next;
	mes "[��C������]";
	mes "�X�C�b�`�����킹�����";
	mes "������ׂ̃��C���X�C�b�`��";
	mes "�����Ă��������B";
	donpcevent "";
	close;
OnStart:
	initnpctimer;
	misceffect 18, "�X�C�b�`128#"; //61652
	misceffect 18, "�X�C�b�`64#"; //61653
	misceffect 18, "�X�C�b�`32#"; //61654
	misceffect 18, "�X�C�b�`16#"; //61655
	misceffect 18, "�X�C�b�`8#"; //61656
	misceffect 18, "�X�C�b�`4#"; //61657
	misceffect 18, "�X�C�b�`2#"; //61658
	misceffect 18, "�X�C�b�`1#"; //61659
	end;
OnTimer5000:
	initnpctimer;
	misceffect 203, "���C���X�C�b�`#"; //61661
	misceffect 204, "�X�C�b�`128#"; //61652
	misceffect 205, "�X�C�b�`64#"; //61653
	misceffect 206, "�X�C�b�`32#"; //61654
	misceffect 207, "�X�C�b�`16#"; //61655
	misceffect 208, "�X�C�b�`8#"; //61656
	misceffect 209, "�X�C�b�`4#"; //61657
	misceffect 210, "�X�C�b�`2#"; //61658
	misceffect 211, "�X�C�b�`1#"; //61659
	end;
}
1@lab.gat,34,37,3	script	���C���X�C�b�`#	844,{/* 61661 */
	initnpctimer;
	end;
	npctalk "�{���̗������苖�R�[�h[" ++ "]";
	npctalk "���͂��ꂽ2�i���ϊ��R�[�h[" ++ "]";
	npctalk "�R�[�h�̈�v���m�F�ł��܂���B�������R�[�h����͂��Ă��������B";
	npctalk "�R�[�h�̈�v���m�F���܂����B�������J���܂��B";
}

1@lab.gat,29,38,0	warp	lab_warp#4	1,1,1@lab.gat,29,43	//61664
1@lab.gat,48,82,0	warp	lab_warp#5	1,1,1@lab.gat,58,82	//61665
1@lab.gat,91,80,5	script	#gen_01	844,{/* 61666 (hide)*/}
1@lab.gat,96,81,5	script	#gen_02	844,{/* 61667 (hide)*/}
1@lab.gat,99,85,5	script	#gen_03	844,{/* 61668 (hide)*/}
1@lab.gat,99,91,5	script	#gen_04	844,{/* 61669 (hide)*/}
1@lab.gat,96,95,5	script	#gen_05	844,{/* 61670 (hide)*/}
1@lab.gat,91,97,5	script	#gen_06	844,{/* 61671 (hide)*/}
1@lab.gat,85,96,5	script	#gen_07	844,{/* 61672 (hide)*/}
1@lab.gat,82,91,5	script	#gen_08	844,{/* 61673 (hide)*/}
1@lab.gat,82,86,5	script	#gen_09	844,{/* 61674 (hide)*/}
1@lab.gat,85,81,5	script	#gen_10	844,{/* 61675 (hide)*/}
1@lab.gat,90,97,5	script	#gen_11	844,{/* 61676 (hide)*/}
1@lab.gat,82,89,5	script	#gen_12	844,{/* 61677 (hide)*/}
1@lab.gat,91,80,5	script	#gen_13	844,{/* 61678 (hide)*/}
1@lab.gat,99,88,5	script	#gen_14	844,{/* 61679 (hide)*/}
1@lab.gat,80,87,7	script	Dr.�t�F�f���R#pa0829	865,{/* 61680 */}
1@lab.gat,81,84,7	script	Dr.�V���r�A#pa0829	982,{/* 61681 */}
1@lab.gat,80,90,6	script	Dr.�A���e�~�A#pa0829	982,{/* 61682 */}
1@lab.gat,81,93,6	script	Dr.���B���Z���g#pa0829	865,{/* 61683 */}

1@lab.gat,80,89,0	script	#wp01	139,{/* 61688 */}

1@lab.gat,123,88,0	script	lab_warp#end	45,1,1,{/* 61693 (hide)*/
	setquest 118320; //state=1
	warp "verus01.gat",152,150;
	end;
}
